/**
 * arrayTOlinkedlist
 */


public class arrayTOlinkedlist {

    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    }

    public static Node arraytoLL(int arr[]){
        if(arr==null || arr.length==0) return null;

        Node head=new Node(arr[0]);
        Node current=head;

        for(int i=1;i<arr.length;i++){
            // Node newNode=new Node(arr[i]);
            current.next=new Node(arr[i]);
            current=current.next;
        }
        return head;
    }

    public static void printLL(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        Node linkedListHead = arraytoLL(arr);
        printLL(linkedListHead);

    }
}
}