package filas;

public class FilaString {
	
	private class No{
		String dados;
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
		
		public void enqueue(String elem) {
			No novo = new No();
			novo.dados = elem;
			novo.prox = null;
			
			 if(isEmpty()) 
				 ini = novo;
			 else
				 fim.prox = novo;
			 fim = novo;
		}
		
		public String first() {
			return (ini.dados);
		}
		
		public String dequeue() {
			String valor = ini.dados;
			ini = ini.prox;
			 if(ini == null)
				 fim = null;
				 return valor;
		}

}
