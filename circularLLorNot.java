/**
 * circularLLorNot
 */
public class circularLLorNot {
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

    public boolean checkCircular(Node head){
        if(head==null) return false;

        Node hare=head;
        Node turtle=head;
        while(hare.next != null && hare.next.next !=null){
            hare=hare.next.next;
            turtle=turtle.next;

            if(hare==turtle){
                return true;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        circularLLorNot list=new circularLLorNot();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.printLL();

        boolean result=list.checkCircular(list.head);
        System.out.print("Is list circular ? " + result);
    }
}