class DoublyLinkedList {

    private Nodo head;
    private Nodo tail;

        // Inserimento all'inizio
    public void addFirst(int data) {
        Nodo newNode = new Nodo(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Inserimento alla fine
    public void addLast(int data) {
        Nodo newNode = new Nodo(data);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Rimozione di un valore
    public void remove(int data) {
        Nodo current = head;

        while (current != null) {
            if (current.data == data) {

                if (current == head) {
                    head = current.next;
                    if (head != null) head.prev = null;
                } 
                else if (current == tail) {
                    tail = current.prev;
                    tail.next = null;
                } 
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                return;
            }
            current = current.next;
        }
        System.out.println("Valore nullo " + data);
    }

    // Stampa dall'inizio alla fine
    public void printForward() {
        Nodo current = head;
        System.out.print("Avanti: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Stampa da fine ad inizio
    public void printBackward() {
        Nodo current = tail;
        System.out.print("Indietro: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}