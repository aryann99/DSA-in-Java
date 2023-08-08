public class add1toLL {
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

    public Node reverse(Node head){
        Node current=head;
        Node prev=null;
        Node next=null;

        while(current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    public Node addOne(Node head){
        head=reverse(head);

        Node current=head;
        Node prev=head;

        int sum=current.data+1;
        current.data=sum%10;
        int carry=sum/10;
        current=current.next;

        while(current != null){
            sum=current.data+carry;
            current.data=sum%10;
            carry=sum/10;
            prev=current;
            current=current.next;
        }

        if(carry != 0){
            prev.next=new Node(carry);
        }
        head=reverse(head);
        return head;
    }
    
    public void printLL(){
        Node current=head;
        if(current == null){
            System.out.print("Empty LL");
        }
        while(current != null){
            System.out.print(current.data + " -> ");
            current=current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        add1toLL list=new add1toLL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Original List:");
        list.printLL();

        list.head = list.addOne(list.head);
        System.out.println("Modified List:");
        list.printLL();

       
    }
}


/*
 *  list.addOne(list.head);
        list.printLL();
 */