public class Lista {
    
    Nodo root;
    
    public Lista() {
        root = null;
    }
    
    public void addHead(Nodo n){
        Nodo temp = root;
        root = n;
        n.setNext(temp);
    }
    
    public void addTail(Nodo n){
        if (root==null) {
            root = n;
            return;
        } else {
        Nodo temp = root;
        while(temp.getNext()!=null) temp=temp.getNext();
        temp.setNext(n);    
        }
    }
    
    public String toString() {
        String s = "La lista contiene: ";
        Nodo temp = root;
        while(temp!=null) {
            s += temp.getValue() + "-";
            temp = temp.getNext();
        }
        return s + "\n";
    }
}