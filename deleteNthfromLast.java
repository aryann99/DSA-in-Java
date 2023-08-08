public class deleteNthfromLast {

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

    public Node findingNth(int n){
        Node current=head;
        int count=1;
        while(current!=null && count<n){
            current=current.next;
            count++;
        }
        return current;
    }

    public void deleteNode(int n){
        if(n<=0){
            return;
        }
        if(n==1){
            head=head.next;
            return;
        }

        Node prev = null;
        Node current = head;
        int count = 1;
        while (current != null && count < n) {
            prev = current;
            current = current.next;
            count++;
        }
        if (current != null) {
            prev.next = current.next;
        }
    }

    public void printLL(){
        Node curr=head;
        if(curr == null){
            System.out.print("The linkedlist is empty");
        }
        while(curr != null){
            System.out.print(curr.data +" -> ");
            curr=curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        deleteNthfromLast list=new deleteNthfromLast();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.printLL();

        int n=3;
        Node nthNode=list.findingNth(n);
        if (nthNode != null) {
            System.out.println("Node at position " + n + " from beginning is: " + nthNode.data);
            list.deleteNode(n);
            System.out.println("Linked List after deleting the " + n + "th node from the beginning:");
            list.printLL();
        } else {
            System.out.println("The linked list doesn't have enough nodes.");
        }
    }
}
