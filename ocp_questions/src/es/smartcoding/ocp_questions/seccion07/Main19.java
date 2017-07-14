/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author jmendez
 *
 */
public class Main19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object object1 = new Object();
		Object object2 = new Object();
		ExecutorService service = Executors.newFixedThreadPool(1);
		Future<?> future1 = service.submit(() -> {
			synchronized (object1) {
				synchronized (object2) {
					return ("alfa");
				} 
			}
		});
		Future<?> future2 = service.submit(() -> {
			synchronized (object2) {
				synchronized (object1) {
					return ("bravo");
				} 
			}
		});
		try {
			System.out.println(future1.get()); 
			System.out.println(future2.get()); 
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
