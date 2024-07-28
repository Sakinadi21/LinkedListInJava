package Basic;

public class Basicll {
    public static class Node{
        int data; //value
        Node next; //adress of next node
    }


    public static void main(String[] args) {
        Node x= new Node();
        System.out.println(x.data);
        System.out.println(x);
        System.out.println(x.next);
    }
}
