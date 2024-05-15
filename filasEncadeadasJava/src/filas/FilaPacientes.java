package filas;

import exe4.Paciente;

public class FilaPacientes {
	
	private class No{
		Paciente dados;
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
		
		public void enqueue(Paciente elem) {
			No novo = new No();
			novo.dados = elem;
			novo.prox = null;
			
			 if(isEmpty()) 
				 ini = novo;
			 else
				 fim.prox = novo;
			 fim = novo;
		}
		
		public Paciente first() {
			return (ini.dados);
		}
		
		public Paciente dequeue() {
			Paciente valor = ini.dados;
			ini = ini.prox;
			 if(ini == null)
				 fim = null;
				 return valor;
		}

}
