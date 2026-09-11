public class FirstnLastremove {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void add(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        Node newNode = new Node(data);

        if (idx == 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public int removeFirst() {
        if (size == 0) {
            return -1;
        }

        int val = head.data;
        head = head.next;
        size--;

        if (size == 0) {
            tail = null;
        }

        return val;
    }

    public int removeLast() {
        if (size == 0) {
            return -1;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        Node prev = head;

        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    public int Iterativesearch(int key){
     int i=0;
     Node temp = head;
     while (temp != null) {
     if(temp.data == key){
        return i;
     }
        temp = temp.next;
        i++; 
     }
     return -1;
    }
    public static void main(String[] args) {

        FirstnLastremove ll = new FirstnLastremove();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        ll.add(2, 9);

        ll.print();

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();
        System.out.println(ll.Iterativesearch(5));
        System.out.println(ll.Iterativesearch(10));
    }
}
