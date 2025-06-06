public class LLReverse {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;


    public void add(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void disp() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    
    public void reverseLL() {
        if (head == null || head.next == null) {
            return;
        }
        Node prev = head;
        Node cur = head.next;

        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;

            prev = cur;
            cur = next;
        }
        head.next = null;
        head = prev;
    }

    public static void main(String[] args) {
        LLReverse ll = new LLReverse();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.disp();
        ll.reverseLL();
        ll.disp();
    }
}
