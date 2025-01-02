 class Node {
    int data;
    Node next;
    
Node (int data){
    this.data=data;
    this.next=null;
}
}
class Main{
    public static Node InsertAtBeginning(Node head,int data){
      Node newnode=new Node(data);
      newnode.next=head;
      head=newnode;
      return head;
    }
    public static void main(String[] args){
        Node head=new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(4);
        head=InsertAtBeginning(head,1);
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("null");
        
    }
}
