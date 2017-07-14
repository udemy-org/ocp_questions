/**
 * 
 */
package es.smartcoding.ocp_questions.seccion07;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author jmendez
 *
 */

public class Main03 {

	/**
	 * @param args
	 * @throws ExecutionException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleWithFixedDelay(() -> { // (1)
			System.out.println("A"); // (2)
		}, 0, 1, TimeUnit.MINUTES);
		Future<?> result = service.submit(() -> System.out.println("B")); // (3)
		System.out.println(result.get()); // (4)
	}

}
