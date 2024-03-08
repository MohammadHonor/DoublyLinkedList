
class Node {
    Node prev;
    int data;
    Node next;

    public Node(int d) {
        this.prev = null;
        this.data = d;
        this.next = null;
    }
}

public class DLL {
    static Node head = null;
    static Node tail = null;

    public static void main(String[] args) {
        DLL obj = new DLL();
        obj.insertAtBegining(10);
        obj.insertAtBegining(20);
        obj.insertAtBegining(30);
        obj.insertAtBegining(40);
        obj.insertAtBegining(50);
        obj.insertAtEnd(60);

         System.out.println();
        System.out.println(head.data);
        System.out.println(tail.data);
        System.out.println(tail.next);

        obj.display(head);
       

    }

    void insertAtBegining(int d) {

        Node temp = new Node(d);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    void display(Node head) {
        if (head == null) {
            System.out.println("Node is not present");
        } else {
            while (head != null) {
                System.out.print( head.data+"->" );
                head = head.next;
            }
        }
    }
    void insertAtEnd(int d){
        Node temp=new Node(d);
        if(tail==null){
            tail=temp;
            head=temp;
        }
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
    }
    

}
