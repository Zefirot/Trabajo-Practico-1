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
	public void TurnosTest() {
		tablero.marcarTablero(1); 
		tablero.marcarTablero(2);
		tablero.marcarTablero(3);
		tablero.marcarTablero(4);

		assertEquals(4,tablero.getTurno());
	}
	
	@Test
	public void TableroGanadorFilaTest() { //FILAS
		//P1 es el jugador 1 y P2 es el jugador 2
		tablero.marcarTablero(7); //P1
		tablero.marcarTablero(5); //P2
		tablero.marcarTablero(8); //P1
		tablero.marcarTablero(4); //P2
		tablero.marcarTablero(9); //P1
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
	public void TableroGanadorDiagonal() {  //DIAGONAL
		
		tablero.marcarTablero(1);//P1
		tablero.marcarTablero(2);//P2
		tablero.marcarTablero(5);//P1
		tablero.marcarTablero(7);//P2
		tablero.marcarTablero(9);//P1
		
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
