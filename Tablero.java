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
	
	
	public int ganador() {
		//Como solo hay un posible ganador y es imposible que se formen
		
		//System.out.println(ganadorFilas());
		
		return ganadorFilas()+ganadorColumnas()+ganadorDiagonalIzquierda()+ganadorDiagonalDerecha();
		
	}
	
	private int ganadorFilas() { //Se detecta cuando hay un ganador por filas.
		
		int cont=0;
		
		int valor=0;
		
		for(int c=0; c<tablero[0].length; c++) { //Recorro filas
			
			
			valor=tablero[c][0]; //Agarro el primer valor de la fila
		
			for(int f=0; f<tablero.length; f++) { //Recorro columnas
				cont += tablero[c][f]==valor? 1:0;
			}
			if(cont==3) {return valor;}
			
			cont=0;  //Reseteo el valor del contador
		}
	
		return cont;
		
	}
	
	private int ganadorColumnas() {

		int cont=0;
		int valor=0;
		
		for(int f=0; f<tablero.length; f++) { //Recorro filas

			valor=tablero[0][f]; //Agarro el primer valor de la fila

			for(int c=0; c<tablero[0].length; c++) { //Recorro columnas
				//System.out.println(valor);
				cont += tablero[f][c]==valor? 1:0;
				System.out.println(cont);
			}
			
			if(cont==3) {return valor;}
			cont=0;  //Reseteo el valor del contador
		}

		return cont;
		
	}
	
	private int ganadorDiagonalIzquierda() {
		
		int cont = 0;
		int aux=0;
		int valor=tablero[0][0];
		
		for(int c=0; c<tablero.length; c++ ) {
			
			cont += tablero[aux][c]==valor?1:0;
			aux++;
			
		}
		return cont==3?valor:0;
		
	}

	
	private int ganadorDiagonalDerecha() {
		int cont = 0;
		int aux=0;
		int valor=tablero[0][0];
		
		for(int c=tablero.length-1; c<=0; c--) {

			valor=tablero[0][c]; //Agarro el primer valor de la fila.
			cont=0; //Reseteo en contador.
			aux=0; //Reseteo la variable aux.

			cont += tablero[aux][c]==valor?1:0;
			aux++;

		}
		return cont==3?valor:0;
		
	}
	

	@Override
	public String toString() {
		
		String mat = "";
		
		for(int c=0; c<tablero[0].length; c++) {
			
			
			for(int f=0; f<tablero.length; f++) {
				
				mat += String.valueOf(tablero[c][f])+" ";
				
				
			}
			
			mat+="\n";
			
			
		}
		
		return mat;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Tablero nuevo = new Tablero();
		nuevo.marcarTablero(1);//P1
		nuevo.marcarTablero(6);//P2
		nuevo.marcarTablero(5);//P1
		nuevo.marcarTablero(3);//P2
		nuevo.marcarTablero(2);//P1
		nuevo.marcarTablero(9);//P2
		
		
		System.out.println(nuevo.toString());
		System.out.println(nuevo.ganador());
		
	}
	
	
}
