public class middleofLL {
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

    public void deletemid(Node head){
        Node rabbit=head;
        Node turtle=head;
        Node OnelessThanTurtle=null;
        while(rabbit != null && rabbit.next != null){
            rabbit=rabbit.next.next;
            OnelessThanTurtle = turtle;
            turtle=turtle.next;
        }
        if(OnelessThanTurtle != null){
            OnelessThanTurtle.next=turtle.next;
        }
        else{
            head=head.next;
        }
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
        middleofLL list=new middleofLL();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("Original List:");
        list.printLL();
        list.deletemid(list.head);
        System.out.print("The list after deleting middle of is : ");
        list.printLL();
    }
}
