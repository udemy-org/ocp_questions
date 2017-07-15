/**
 * 
 */
package es.smartcoding.ocp_questions.seccion08;

import java.io.Serializable;

/**
 * @author jmendez
 *
 */

class C1 implements Serializable {}
class C2 extends Thread implements Serializable {} // (1)
final class C3 implements Serializable {}
abstract class C4 implements Serializable {} // (2)
class C5 extends C4 {}

public class Main06 {

	public static void main(String[] args) {
		C1 c1 = new C1();
		C2 c2 = new C2();
		C3 c3 = new C3();
		C5 c5 = new C5();
		System.out.println(c1 instanceof Serializable);
		System.out.println(c2 instanceof Serializable);
		System.out.println(c3 instanceof Serializable);
		System.out.println(c5 instanceof Serializable);
	}

}
