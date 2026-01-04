public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.addFirst(10);
        list.addFirst(5);
        list.addLast(20);
        list.addLast(30);

        // Stampa avanti e indietro
        list.printForward();    
        list.printBackward();  

        // Rimozioni
        list.remove(10);
        list.printForward();    

        list.remove(5);
        list.printForward();    
        list.printBackward();   
    }
}

