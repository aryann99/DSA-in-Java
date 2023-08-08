/**
 * demo
 */
public class demo {
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

    public Node searchNth(Node head,int x){
        Node ptr1=head;
        Node ptr2=head;
        
        for(int i=0;i<x;i++){
            if(ptr2==null){
            return null;
            }
        ptr2=ptr2.next;
        }

        while(ptr2!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return ptr1;
    }
    public void printLL(){
        Node curr=head;
        if(curr==null){
           System.out.print("Empty");
        }   
        while(curr !=null){

            System.out.print(curr.data + " -> ");
            curr=curr.next;
        }
        System.out.println("NULL");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        demo list=new demo();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);
        list.printLL();

        int x=8;
        Node result=list.searchNth(list.head, x);
        if(result != null){
            System.out.print("The "+x+"number for last is " + result.data);
        }
        else{
            System.out.print("Fewfef");
        }
    }
}