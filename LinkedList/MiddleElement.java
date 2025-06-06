public class LLMiddle {
    private Node head = null;
    private Node tail = null;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

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
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
      public Node middleNode() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

class Main {
    public static void main(String[] args) {
        LLMiddle ll = new LLMiddle();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(70);
        System.out.println("The linked list:");
        ll.disp();
        System.out.println("Middle Node: " + ll.middleNode().data);

    }
}

    

