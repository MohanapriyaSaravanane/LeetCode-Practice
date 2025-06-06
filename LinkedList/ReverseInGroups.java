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

    public void reverseInGroup(int G){
        Node current = head;
        Node prev_end = null, new_head = null;
        
        while(current!=null){
            Node start = current;
            Node prev = null;
            Node next = null;
            
            int count=1;
            while(current!=null && count<=G){
                next = current.next;
                current.next = prev;
                prev= current;
                current=next;
                count++;
            }
            
            if(new_head==null)
                new_head = prev;
            if(prev_end != null)
                prev_end.next = prev;
            prev_end = start;
        }
        head = new_head;
    }

    public static void main(String[] args) {
        LL ll = new LL();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.disp();
        ll.reverseInGroup(4);
        ll.disp();
    }
}
