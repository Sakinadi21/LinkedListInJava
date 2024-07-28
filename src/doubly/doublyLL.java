package doubly;

public class doublyLL {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayrev(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void display2(Node random) {
        Node temp = random;
        while (temp.prev != null) {
            temp = temp.prev;
        }

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head, int x) {
        Node t = new Node(x);
        t.next = head;
        if (head != null) {
            head.prev = t;
        }
        head = t;
        return head;
    }

    public static void insertAtTail(Node head, int x) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }

    public static void insertAtIdx(Node head, int idx, int x) {
        Node s = head;
        for (int i = 1; i <= idx - 1; i++) {
            s = s.next;
        }
        Node r = s.next;
        Node t = new Node(x);
        s.next = t;
        t.prev = s;
        t.next = r;
        if (r != null) {
            r.prev = t;
        }
    }

    public static Node deleteAtHead(Node head) {
        if (head == null) return null;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        return head;
    }

    public static void deleteAtTail(Node head) {
        if (head == null) return;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        if (temp.prev != null) {
            temp.prev.next = null;
        }
    }

    public static void deleteAtIdx(Node head, int idx) {
        if (head == null) return;
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        display(a);
        displayrev(e);
        System.out.println("=========================");

        display2(c);
        System.out.println("---------------------------");
        Node newHead = insertAtHead(a, 30);
        display(newHead);
        System.out.println("***************************");
        insertAtTail(newHead, 89);
        display(newHead);

        System.out.println("++++++++++++++++++");
        insertAtIdx(newHead, 3, 56);
        display(newHead);

        System.out.println("/////////////////////////");
        newHead = deleteAtHead(newHead);
        display(newHead);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        deleteAtTail(newHead);
        display(newHead);

        System.out.println("###########################");
        deleteAtIdx(newHead, 3);
        display(newHead);
    }
}

