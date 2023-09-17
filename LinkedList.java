public class LinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    Node head;
    public void insert(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);


        System.out.println(list.head.data);
        System.out.println(list.head.next.data);


    }
}
