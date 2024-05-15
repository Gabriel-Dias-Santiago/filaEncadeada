package Aplicação;

import filas.FilaInt;

public class Main {

	public static void main(String[] args) {
		FilaInt fila = new FilaInt();
		
		
		fila.enqueue(22);
		fila.enqueue(45);
		if(!fila.isEmpty())
			System.out.println(fila.dequeue());
		if(!fila.isEmpty())
			System.out.println(fila.dequeue());
		
	}

}
