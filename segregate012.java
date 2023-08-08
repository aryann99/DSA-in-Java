public class segregate012 {

    segregate012.Node head;
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

    public Node segregate(Node head){  //as input node
        Node current=head;    //outer pointer to iterate
        Node temp=null;     //inner pointer to compare node with current

        while(current!=null){  //until the end of the linked list is reached.
            temp=current.next;
            while(temp!=null){  //it iterates over the remaining nodes after current.
                if(current.data > temp.data){
                    int temp1=current.data;
                    current.data=temp.data;
                    temp.data=temp1;
                }
            temp=temp.next;
            }
            current=current.next;  //The method continues to sort the linked list until the end is reached (i.e., current becomes null).
        }
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
        segregate012 list=new segregate012();
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(1);
        list.add(0);
        System.out.println("Original List:");
        list.printLL();

    Node result=list.segregate(list.head);
    System.out.println("Segregated List:");
    list.printLL();
    }

    public add1toLL.Node addOne(segregate012.Node head2) {
        return null;
    }

}
