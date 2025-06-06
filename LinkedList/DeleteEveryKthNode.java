public class LL {
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

    public void removeEveryNthNode(int n) {
        if (head == null || n < 0) {
            return;
        }
        if (n == 1) {
            head = null;
            return;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node temp = dummy;
        while (temp != null) {
            int i = 1;
            while (i < n) {
                temp = temp.next;
                if (temp == null)
                    return;
                i++;
            }
            temp.next = temp.next.next;
        }

    }
    public static void main(String[] args) {
        LL ll = new LL();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.disp();
        ll.removeEveryNthNode(2);
        ll.disp();
    }
}
