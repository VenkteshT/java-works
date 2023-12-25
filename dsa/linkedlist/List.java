package dsa.linkedlist;

public class List {
    Node head;
    Node tail;
    int size = 0;

    public List() {

    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node cur = head;
        Node nodeNext = cur.next;
        Node fullnext = nodeNext;
        while (nodeNext != null) {
            fullnext = fullnext.next;
            nodeNext.next = cur;
            cur.next = prev;
            prev = cur;
            cur = nodeNext;
            nodeNext = fullnext;
        }
        return cur;
    }

    public Node getIndex(int index) {
        Node temp = this.head;
        int cur = 0;
        while (cur != index) {
            cur++;
            temp = temp.next;
        }
        return temp;
    }

    public void addHead(int data) {
        Node n = new Node(data);
        if (this.head == null) {
            this.head = n;
            this.tail = n;
        } else {
            n.next = this.head;
            this.head = n;
        }
        this.size++;
    }

    public void addTail(int data) {
        Node n = new Node(data);
        if (this.head == null) {
            this.head = n;
            this.tail = n;
            this.size++;
        } else {
            this.tail.next = n;
            this.tail = n;
        }
        this.size++;
    }

    public void addAtIndex(int index, int data) {
        if (index < 0 || index > this.size)
            return;
        if (index == 0) {
            this.addHead(data);
            return;
        }
        if (index == this.size) {
            this.addTail(data);
            return;
        }
        Node node = new Node(data);
        Node prev = this.getIndex(index - 1);
        Node cur = prev.next;
        prev.next = node;
        node.next = cur;
        this.size++;
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= this.size)
            return;
        if (index == 0) {
            this.head = this.head.next;
            this.size--;
            return;
        } else if (index == this.size - 1) {
            Node prev = this.getIndex(index - 1);
            this.tail = prev;
            prev.next = null;
            this.size--;
            return;
        }
        Node prev = this.getIndex(index - 1);
        Node cur = prev.next;
        Node nextNode = cur.next;
        prev.next = nextNode;
        this.size--;
    }

    public static void print(Node t) {
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    public static int size(Node head) {
        if (head == null)
            return 0;
        return 1 + size(head.next);
    }

    public static Node kReverse(Node head, int k) {
        if (head == null || k < 1)
            return null;
        if (k == 1 || head.next == null) {
            System.out.println("rHead:" + head.data);
            Node node = new Node(head.data);
            return node;
        }
        Node newHead = kReverse(head.next, k - 1);
        Node node = new Node(head.data);
        Node t = newHead;
        while (t.next != null)
            t = t.next;
        t.next = node;
        return newHead;
    }

    public static void main(String[] args) {
        List l = new List();
        int b[] = { 1, 0 };
        l.addHead(1);
        for (int i = 2; i < 6; i++) {
            l.addTail(i);
        }

        // getsize of list and define head;
        Node h1 = null;
        int size = size(l.head);

        // declare initial position and update it respectively

        int ini = 0;
        for (int el : b) {

            // travel until desired position in list
            Node temp = l.head;
            int pos = 0;
            while (pos < ini) {
                temp = temp.next;
                pos++;
            }

            // b[i] reversed list
            Node ans = kReverse(temp, el);

            // if cur ini+ next pos < list size update else make reverse all remaining
            // elements
            if (ini + el < size)
                ini = el + ini;
            else
                ini = size;
            // join reversed lists

            if (h1 == null) {
                h1 = ans;
            } else {
                Node t1 = h1;
                while (t1.next != null)
                    t1 = t1.next;
                t1.next = ans;
            }
        }

        Node fin = l.head;
        int j = 0;
        while (j < ini) {
            fin = fin.next;
            j++;
        }
        Node tail = h1;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = fin;
        print(h1);
    }
}
