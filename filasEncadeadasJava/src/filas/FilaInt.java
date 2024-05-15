package filas;

public class FilaInt {
	
	private class No{
	int idades;
	No prox;
	}
	
	No ini, fim;
	
	public void init() {
		ini = fim = null;
	}
	
	public boolean isEmpty() {
		if(ini == null && fim == null)
			return true;
		else
			return false;
	}
	
	public void enqueue(int elem) {
		No novo = new No();
		novo.idades = elem;
		novo.prox = null;
		
		 if(isEmpty()) 
			 ini = novo;
		 else
			 fim.prox = novo;
		 fim = novo;
	}
	
	public int first() {
		return (ini.idades);
	}
	
	public int dequeue() {
		int valor = ini.idades;
		ini = ini.prox;
		 if(ini == null)
			 fim = null;
			 return valor;
	}
}
