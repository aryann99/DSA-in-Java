public class deletemiddleOfLL {
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

    public Node mid(Node head){
        Node rabbit=head;
        Node turtle=head;
        while(rabbit.next != null && rabbit.next.next != null){
            rabbit=rabbit.next.next;
            turtle=turtle.next;
        }
        return turtle;
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
        deletemiddleOfLL list=new deletemiddleOfLL();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        Node result=list.mid(list.head);
        System.out.print("The middle of LL is : "+ result.data);
    }
}

