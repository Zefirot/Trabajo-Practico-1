package trabajo;


public class Tablero {

	private int[][] tablero;
	
	//private ArrayList<Integer> tablero;
	private int turnos;
	
	
	public Tablero() {
		//this.tablero = new ArrayList<Integer>();
		this.tablero = new int[3][3]; 
		this.turnos=0;
	}
	
	public void marcarTablero(int posicion) {
		if(posicion<1 || posicion>9) {
			throw new RuntimeException("La posicion ingresada no corresponde con ningun lugar");
		}
		
		turnos++;
		
		if(turnos%2==1) { //Cuando turnos es impar significa que le toca al jugador 1
			asignar(tablero,posicion,1);
		}else {
			asignar(tablero,posicion,2);
		}
		
	}
	
	private void asignar(int[][] tablero, int posicion, int valor) {
		if(posicion<=3) {
			tablero[0][posicion-1]=valor;
		}
		else if(posicion<=6) {
			tablero[1][posicion-4]=valor;  //posicion -4, porque tengo que restar 3 de la fila anterior y 1 porque comienza a contar desde 0.
		}
		else {
			tablero[2][posicion-7]=valor;  //posicion -7, porque tengo que restar 6 de las filas anteriores y 1 porque comienza a contar desde 0.
		}
		
	}
	
	
	public boolean ganador() {
		
		
		
		
		return true;
		
	}
	
	/*private int ganadorFilas() {
		
		
		
		
		
		
	}*/


	/*@Override
	public String toString() {
		
		String mat = "";
		
		for(int c=0; c<tablero[0].length; c++) {
			
			
			for(int f=0; f<tablero.length; f++) {
				
				mat += String.valueOf(tablero[c][f])+" ";
				
				
			}
			
			mat+="\n";
			
			
		}
		
		return mat;
		
		
	}*/
	
	
	
	public static void main(String[] args) {
		
		Tablero nuevo = new Tablero();
		
		
		
	}
	
	
}
