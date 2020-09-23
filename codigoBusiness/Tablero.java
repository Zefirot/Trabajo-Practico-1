package codigoBusiness;


public class Tablero {

	private int[][] tablero;
	private int turnos;

	public Tablero() {
		this.tablero = new int[3][3]; 
		this.turnos=0;
	}
	
	public void marcarTablero(int posicion) {
		verificarPosicion(posicion);
		
		turnos++;
		
		if(turnos%2==1) { //Cuando turnos es impar significa que le toca al jugador 1
			asignar(tablero,posicion,1);
		}else {
			asignar(tablero,posicion,2);
		}
		
	}
	
	private void verificarPosicion(int posicion) {
		if(posicion<1) {
			throw new IllegalArgumentException("La posicion ingresada no puede ser menor a 1: "+posicion);
		}
		if(posicion>9) {
			throw new IllegalArgumentException("La posicion ingresada no puede ser mayor 9: "+posicion);
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
	
	
	public int ganador() {
		
		if(ganadorFilas()>0) {
			return ganadorFilas();
		}
		else if(ganadorColumnas()>0) {
			return ganadorColumnas();
		}
		else if(ganadorDiagonal()>0) {
			return ganadorDiagonal();
		}
		else if(ganadorDiagonalesContinuas()>0) {
			return ganadorDiagonalesContinuas();
		}
		else {
			return 0;
		}
	}
	
	private int ganadorFilas() { //Se detecta cuando hay un ganador por filas.
		
		for(int jugador=1 ; jugador<=2 ; jugador++) {
			
			if(tablero[0][0]==jugador && tablero[0][1]==jugador && tablero[0][2]==jugador) {
				return jugador;
			}
			
			if(tablero[1][0]==jugador && tablero[1][1]==jugador && tablero[1][2]==jugador) {
				return jugador;
			}
			
			if(tablero[2][0]==jugador && tablero[2][1]==jugador && tablero[2][2]==jugador) {
				return jugador;
			}	
		}
		
		return 0; //Si no existe ningun ganador aun, se devulve 0.
	}
	
	private int ganadorColumnas() {

		for(int jugador=1 ; jugador<=2 ; jugador++) {

			if(tablero[0][0]==jugador && tablero[1][0]==jugador && tablero[2][0]==jugador) {
				return jugador;
			}

			if(tablero[0][1]==jugador && tablero[1][1]==jugador && tablero[2][1]==jugador) {
				return jugador;
			}

			if(tablero[0][2]==jugador && tablero[1][2]==jugador && tablero[2][0]==jugador) {
				return jugador;
			}	
		}
		
		return 0;
		
	}
	
	private int ganadorDiagonal() {
		
		for(int jugador=1 ; jugador<=2 ; jugador++) {

			if(tablero[0][0]==jugador && tablero[1][1]==jugador && tablero[2][2]==jugador) {
				return jugador;
			}

			if(tablero[0][2]==jugador && tablero[1][1]==jugador && tablero[0][0]==jugador) {
				return jugador;
			}

		}
		return 0;
		
	}
	
	private int ganadorDiagonalesContinuas() { //Contemplo cada posible caso que existe para ganar con diagonales continuas.
	
		for(int jugador=1 ; jugador<=2 ; jugador++) {
			
			if( tablero[1][0]==jugador && tablero[0][1]==jugador && tablero[2][2]==jugador) {
				return jugador;
			}
			else if(tablero[0][1]==jugador && tablero[1][2]==jugador && tablero[2][0]==jugador) {
				return jugador;
			}
			else if(tablero[1][2]==jugador && tablero[2][1]==jugador && tablero[0][0]==jugador) {
				return jugador;
			}
			else if(tablero[2][1]==jugador && tablero[1][0]==jugador && tablero[0][2]==jugador) {
				return jugador;
			}
		}
		return 0;
	}

	public int getTurno() {
		return turnos;
	}	
	
	
}
