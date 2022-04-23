package LinkedList;
import java.util.Scanner;
public class Doubly_LL {
    Node head;
    Node tail;
    public boolean isEmpty(){
        return head==null;
    }
    public void addFirByHead(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            tail = head = newNode;
            return;
        }
        newNode.next = head;
        head.prev=newNode;
        head=newNode;

    }

    public void delFirByHead(){
        if(isEmpty()){
            System.out.println("List cleared successfully...");
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    public void addAtPos(String data, int pos){
        Node newNode = new Node(data);
        Node currNode = new Node(data);
        head=currNode;
        for(int i=0 ; i<pos-2; i++)
            head=currNode.next;
        newNode.next=currNode.next;
        currNode.next=newNode;


    }


    public void display() {
        if (isEmpty()) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        System.out.print("[");
        while (currNode != null) {
            System.out.print(currNode.data + ", ");
            currNode = currNode.next;
        }
        System.out.print("\b\b]");
    }
    public void displayRev() {
        if (isEmpty()) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = tail;
        System.out.print("[");
        while (currNode != null) {
            System.out.print(currNode.data + ", ");
            currNode = currNode.prev;
        }
        System.out.print("\b\b]");
    }

    public static void main(String[] args) {
        Doubly_LL lst = new Doubly_LL();
        Scanner sc = new Scanner(System.in);
        lst.addFirByHead("b");
        lst.addFirByHead("a");
        lst.addFirByHead("c");
        lst.addFirByHead("d");
        //lst.delFirByHead();

        //insAtPos("yash", 3);
        //delFirst();
        //  delPos(2);
        lst.display();
        lst.displayRev();
    }
}
