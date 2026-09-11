
public class addMiddle {
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

        public void addMiddle(int idx, int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
            //public void print()

            
            Node temp = head;
            int i = 0;
            while (i < idx - 1) {
                temp = temp.next;
                i++;

            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
         public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

        System.out.println();
    }

         
        public static void main(String[] args) {
            addMiddle ll = new addMiddle();
            ll.addMiddle(0,1);
           // ll.print();
            ll.addMiddle(1,2);
            ll.addMiddle(2,3);
            ll.addMiddle(3,4);
            ll.addMiddle(4,5);
            ll.addMiddle(2,8);

          // ll.print();
           System.out.print(ll.size);
        }
    
    }
