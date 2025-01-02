class Node{
    int data;
    Node next;
Node (int data){
    this.data=data;
    this.next=null;
}
}
class Main{
public static Node revlinkedlist(Node head){
    Node prevNode=null;
    Node currNode=head;
    while(currNode!=null){
        Node nextNode=currNode.next;
        currNode.next=prevNode;
        prevNode=currNode;
        currNode=nextNode;
    }
    head=prevNode;
    return head;
}
public static void main(String[] args){
    Node head=new Node(10);
    head.next=new Node(20);
    head.next.next=new Node(30);
    head = revlinkedlist(head);
    Node current=head;
    while(current!=null){
        System.out.print(current.data+"->");
        current=current.next;
    }
    System.out.print("null");
}
}
