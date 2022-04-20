package LinkedList;
import java.util.Scanner;
public class Singly_LL {
    static Node head;
    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //add first
    public static void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void display(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        System.out.print("[");
        while(currNode!=null){
            System.out.print(currNode.data + ", ");
            currNode=currNode.next;
        }
        System.out.print("\b\b]");
    }

    public static void insAtPos(String data, int pos){
        if(pos==0){
            System.out.println("Errur");
        }
        else if(pos==1){
            addFirst(data);
        }
        else{
            Node newNode = new Node(data);
            Node currNode = head;
            for(int i=0;i<pos-2;i++)
                currNode=currNode.next;
            newNode.next=currNode.next;
            currNode.next=newNode;
        }
    }

    public static void delFirst(){
        if(head==null){
            System.out.println("enptyyyyy");
            return;
        }
        head = head.next;
    }

    public static void delPos(int pos){
        if(head==null){
            System.out.println("emptyyyy");
            return;
        }
        else if(pos==0){
            System.out.println("errur");
        }
        else if(pos==1){
            delFirst();
        }
        else{
            Node currNode = head;
            for(int i=0 ; i<pos-2 ; i++)
                currNode = currNode.next;
            currNode.next=currNode.next.next;
        }
    }

    public static void main(String[] args) {
        Singly_LL lst = new Singly_LL();
        Scanner sc = new Scanner(System.in);
        addFirst("b");
        addFirst("a");
        addFirst("c");
        addFirst("d");

        //insAtPos("yash", 3);
        //delFirst();
        delPos(2);
        display();
    }
}
