public class App {
    
	public static void main(String[] args) {
	    Lista l1= new Lista();
	    l1.addTail (new Nodo("Ciao"));
	    l1.addTail (new Nodo("Alice"));
	    l1.addTail (new Nodo("Andrea"));
	    l1.addTail (new Nodo("Ali"));
	    l1.addHead (new Nodo("AliReali"));
        l1.add("Federico");
		System.out.println(l1);
	}
}
