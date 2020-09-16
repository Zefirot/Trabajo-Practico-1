package trabajo;

import java.util.ArrayList;

public class Tablero {

	private ArrayList<Integer> tablero;
	private int turnos;
	
	
	public Tablero() {
		this.tablero = new ArrayList<Integer>();
		this.turnos=0;
	}
	
	public void marcarTablero(int posicion) {
		turnos++;
		
		if(turnos%2==1) { //Cuando turnos es impar significa que le toca al jugador 1
			asignar(tablero,posicion,1);
		}else {
			asignar(tablero,posicion,2);
		}
		
	}
	
	private void asignar(ArrayList<Integer> tablero, int posicion, int valor) {
		int cont=0;
		for(int i= 0 ; i<tablero.size(); i++) {
			if(i+1==posicion) { //si la posicion es 1 por ejemplo entonces i=0 es donde se debe colar el valor 
				tablero.add(valor);
			}
			cont++;
		}
	}
	
	
	public boolean ganador() {
		
		
		
		
		return true;
		
	}
	
	private boolean ganadorFilas() {
		
		if( tablero.get(0) && tablero.get(1) && tablero.get(2) == 1 ) {
			return true;
		}
		
		
		
		
	}
	
	
	
	
}
