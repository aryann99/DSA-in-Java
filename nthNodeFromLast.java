public class nthNodeFromLast {

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

    public Node searchNthNode(Node head,int n){
        Node ptr1=head;
        Node ptr2=head;

        // we take 2 pointors
        // ptr2 runs "n" steps ahead of ptr1
        for(int i=0;i<n;i++){
            if(ptr2==null){
                return null;
            }
            ptr2=ptr2.next;
        }

        while(ptr2 != null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return ptr1;
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
        nthNodeFromLast list=new nthNodeFromLast();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.printLL();

        int n=3;
        Node result=list.searchNthNode(list.head, n);

        if(result != null){
            System.out.print("The "+n+ " node from last is " + result.data);
        }
        else{
            System.out.println("The linked list doesn't have enough nodes.");
        }
        
    }
}
