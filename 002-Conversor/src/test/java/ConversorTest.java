import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.masterjava.modelo.conversor.Conversor;

/**
 *
 * ConversorTest Test que comprueba el funcionamiento de los métodos de la clase
 * Conversor para convertir euros a pesetas y viceversa.
 *
 * @author Pablo Guijarro
 * @version 1.0, 2 oct 2024
 */
class ConversorTest {

	Conversor conversor = new Conversor();

	@Test
	void convertirEurosAPesetasTest() {
		double pesetas = conversor.convertirEurosAPesetas(100);
		assertEquals(16638.6, pesetas);
	}

	@Test
	void convertirPesetasAEurosTest() {
		double euros = conversor.convertirPesetasAEuros(16638.6);
		assertEquals(100, euros);
	}

}
