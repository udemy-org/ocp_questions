/**
 * 
 */
package es.smartcoding.ocp_questions.seccion09;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 * @author jmendez
 *
 */
public class Main13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * An object that may be used to locate a file in a file system.
		 * 
		 * It will typically represent a system dependent file path.
		 * 
		 * A Path represents a path that is hierarchical and composed of a
		 * sequence of directory and file name elements separated by a special
		 * separator or delimiter.
		 * 
		 * A root component, that identifies a file system hierarchy, may also
		 * be present.
		 * 
		 * The name element that is farthest from the root of the directory
		 * hierarchy is the name of a file or directory. The other name elements
		 * are directory names.
		 * 
		 * A Path can represent a root, a root and a sequence of names, or
		 * simply one or more name elements.
		 * 
		 * A Path is considered to be an empty path if it consists solely of one
		 * name element that is empty.
		 * 
		 * Accessing a file using an empty path is equivalent to accessing the
		 * default directory of the file system.
		 * 
		 * Path defines the getFileName, getParent, getRoot, and subpath methods
		 * to access the path components or a subsequence of its name elements.
		 * 
		 * In addition to accessing the components of a path, a Path also
		 * defines the resolve and resolveSibling methods to combine paths. The
		 * relativize method that can be used to construct a relative path
		 * between two paths. Paths can be compared, and tested against each
		 * other using the startsWith and endsWith methods.
		 * 
		 * This interface extends Watchable interface so that a directory
		 * located by a path can be registered with a WatchService and entries
		 * in the directory watched.
		 * 
		 * Se trata de un objeto que puede usarse para localizar un fichero en
		 * un sistema de ficheros​
		 * 
		 * Un Path representa es jerárquico y se compone de una secuencia de
		 * directorios y nombre de fichero separado por un delimitador o
		 * seprador especial
		 * 
		 * También puede haber un componente raíz o root que se encuentra en lo
		 * más alto de la jerarquía
		 * 
		 * Un Path se considera vacío si consta únicamente de un elemento que
		 * está vacío y es equivalente al directorio por defecto del sistema de
		 * archivos​
		 * 
		 * La interfaz Path define métodos como getFileName(), getParent(),
		 * getRoot() y subpath(). El método resolve() que combina paths y el
		 * método relativize() que puede utilizarse para construir un camino
		 * relativo entre dos paths
		 * 
		 * La interfaz Path extiende Watchable, de manera que un directorio
		 * representado por un Path puede registrarse con un WatchableService
		 * para monitorizar sus entradas​
		 */

		Path current = FileSystems.getDefault().getPath("").toAbsolutePath();
		WatchService watcher = FileSystems.getDefault().newWatchService();
		current.register(watcher, StandardWatchEventKinds.ENTRY_CREATE);
		System.out.println(current);

		for (;;) {

			// wait for key to be signaled
			WatchKey key;
			try {
				key = watcher.take();
			} catch (InterruptedException x) {
				return;
			}
			for (WatchEvent<?> event : key.pollEvents()) {
				WatchEvent.Kind<?> kind = event.kind();

				// This key is registered only
				// for ENTRY_CREATE events,
				// but an OVERFLOW event can
				// occur regardless if events
				// are lost or discarded.
				if (kind == StandardWatchEventKinds.OVERFLOW) {
					continue;
				}

				// The filename is the
				// context of the event.
				WatchEvent<Path> ev = (WatchEvent<Path>) event;
				Path filename = ev.context();

				// Verify that the new
				// file is a text file.
				try {
					// Resolve the filename against the directory.
					// If the filename is "test" and the directory is "foo",
					// the resolved name is "test/foo".
					Path child = current.resolve(filename);
					System.out.println(child);
//					if (!Files.probeContentType(child).equals("text/plain")) {
//						System.err.format("New file '%s'" + " is not a plain text file.%n", filename);
//						continue;
//					}
				} catch (Exception x) {
					System.err.println(x);
					continue;
				}

				// Email the file to the
				// specified email alias.
				System.out.format("Emailing file %s%n", filename);
				// Details left to reader....
			}

			// Reset the key -- this step is critical if you want to
			// receive further watch events. If the key is no longer valid,
			// the directory is inaccessible so exit the loop.
			boolean valid = key.reset();
			if (!valid) {
				break;
			}
		}

	}

}
