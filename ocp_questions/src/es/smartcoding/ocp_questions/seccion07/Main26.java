/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jmendez
 *
 */
public class Main26 {

	private static AtomicInteger contador1 = new AtomicInteger(0); // (1)
	private static int contador2 = 0;

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor(); // (2)
			for (int i = 0; i < 100; i++) {
				service.execute(() -> {
					contador1.getAndIncrement();
					contador2++;
				}); 
			}
			Thread.sleep(100);
			System.out.printf("%s %s", contador1, contador2); // (3)
		} finally {
			if (service != null)
				service.shutdown();
		}
	}

}
