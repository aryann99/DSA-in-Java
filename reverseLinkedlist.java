public class reverseLinkedlist {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void add(int newdata){
        Node newnode=new Node(newdata);
        newnode.next=head;
        head=newnode;
    }

    public void reverse(){
        if(head==null || head.next==null) return;
        Node prev=null;
        Node curr=head;
        Node next=null;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void printLL(){
        Node curr=head;
        if(curr==null){
            System.out.print("Empty");
        }
        while(curr != null){
            System.out.print(curr.data +" -> ");
            curr=curr.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        reverseLinkedlist list=new reverseLinkedlist();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original LL");
        list.printLL();

        System.out.println();

        list.reverse();

        System.out.println("Reversed LL");
        list.printLL();
    }
}