/**
 * 
 */
package es.smartcoding.ocp_questions.seccion01;

/**
 * @author jmendez
 *
 */
class EquipoDeportivo {
	private String localidad;
	private String mascota;
	private int puntos;
	
	public boolean equals(Object object) {
		if (!(object instanceof EquipoDeportivo)) {
			return false;
		}
		EquipoDeportivo temporal = (EquipoDeportivo) object;
		return localidad.equals(temporal.localidad) && mascota.equals(temporal.mascota);
	}
	
	public int hashCode() {
		return puntos;
	}
}
public class Main06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
