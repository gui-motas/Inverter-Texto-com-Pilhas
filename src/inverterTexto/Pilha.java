package inverterTexto;

public class Pilha {

	char letras [];
	int topo = -1;
	public Pilha() {
		
		this.letras = new char[50];
		this.topo = topo;
	}
	
	public void push(char e) {
		
		topo++;
		letras[topo] = e;
	}
	
	public char pop(){
		char e;
		e = letras[topo];
		topo--;
		return e;
	}
	
	public boolean isEmpty() {
		return (topo == -1);
		
		
	}
	public boolean isFull() {
		return (topo == 9);
	}
	
	public char topo() {
		return letras[topo];
	}
	
}
