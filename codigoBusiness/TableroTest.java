package codigoBusiness;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TableroTest {

	private Tablero tablero;
	
	@Before
	public void crear() {
		this.tablero = new Tablero();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void TableroPosicionMenorTest() {
		tablero.marcarTablero(0);
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void TableroPosicionMayorTest() {
		tablero.marcarTablero(10);
	}
	
	
	@Test
	public void TableroGanadorFilaTest() { //FILAS
		
		tablero.marcarTablero(1); //P1
		tablero.marcarTablero(5); //P2
		tablero.marcarTablero(2); //P1
		tablero.marcarTablero(7); //P2
		tablero.marcarTablero(3); //P1
		tablero.marcarTablero(6); //P2
	
		assertEquals(1,tablero.ganador());
	}
	
	
	@Test
	public void TableroGanadorColumnaTest() { //COLUMNAS
		
		tablero.marcarTablero(1); //P1
		tablero.marcarTablero(5); //P2
		tablero.marcarTablero(4); //P1
		tablero.marcarTablero(8); //P2
		tablero.marcarTablero(7); //P1
		tablero.marcarTablero(6); //P2
	
		assertEquals(1,tablero.ganador());
	}
	
	@Test
	public void TableroGanadorDiagonalNormalTest() { //DIAGONALES NORMALES
		
		tablero.marcarTablero(1); //P1
		tablero.marcarTablero(3); //P2
		tablero.marcarTablero(5); //P1
		tablero.marcarTablero(7); //P2
		tablero.marcarTablero(9); //P1
		tablero.marcarTablero(6); //P2
	
		assertEquals(1,tablero.ganador());
	}
	
	
	@Test
	public void TableroGanadorDiagonalContinuasTest() { //DIAGONALES CONTINUAS
		
		tablero.marcarTablero(4); //P1
		tablero.marcarTablero(5); //P2
		tablero.marcarTablero(8); //P1
		tablero.marcarTablero(7); //P2
		tablero.marcarTablero(3); //P1
		tablero.marcarTablero(6); //P2
	
		assertEquals(1,tablero.ganador());
	}
	
	

}
