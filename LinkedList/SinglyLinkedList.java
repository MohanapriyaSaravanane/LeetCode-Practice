public class LL {
    private Node head = null;
    private int size = 0;

    static class Node {
        String data;
        Node next;
        
        public Node(String data) {
            this.data = data;
            this.next = null;
            
        }
    }

    public void addFirst(String data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }

    public void addLast(String data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = newnode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newnode;

    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node lastnode = head.next;
        Node secondlast = head;
        while (lastnode.next != null) {
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;

    }

    public void addAtPos(int pos, String data) {
        if (pos <= 0 || pos > size + 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            addFirst(data);
            return;
        }
        if (pos == size + 1) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node prev = head;
        int i = 1;
        while (i < pos - 1) {
            prev = prev.next;
            i++;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }

    public void deleteAtPos(int pos) {
        if (pos <= 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            removeFirst();
            return;
        }
        Node prev = head;
        int i = 1;
        while (i < pos - 1) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        size--;
    }

    public Node get(int pos) {
        if ((head != null) && (pos > 0)) {
            Node currnode = head;
            int i = 0;
            while (i < pos - 1) {
                currnode = currnode.next;
                if (currnode == null)
                    return null;
                i++;
            }
            return currnode;
        } else {
            return null;
        }
    }
    
    public void print() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "->");
            currnode = currnode.next;
        }
        System.out.println("Null");

    }


    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("2");
        list.addFirst("1");
        list.addLast("4");
        list.addLast("6");
        list.print();
        list.addAtPos(2, "6");
        list.deleteAtPos(1);
        list.print();
        System.out.println(list.get(1));

        
    }
}
