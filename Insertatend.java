class Node{
    int data;
    Node next;
Node(int data){
    this.data=data;
    this.next=null;
}
}
class Main{
public static Node insertAtend(Node head,int data){
    Node newNode=new Node(data);
    Node ptr=head;
    while(ptr.next!=null){
        ptr=ptr.next;
    }
    ptr.next=newNode;
    return head;
}

public static void main(String[] args){
    Node head=new Node(10);
    head.next=new Node(20);
    head.next.next=new Node(30);
    head= insertAtend(head,5);
    Node current=head;
    while(current!=null){
       System.out.print(current.data+"->") ;
       current=current.next;
    }
    System.out.print("null");
    
}
}
  
