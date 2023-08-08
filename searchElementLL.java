public class searchElementLL {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void push(int newdata){

        Node newnode=new Node(newdata);
        newnode.next=head;
        head=newnode;
    }

    public boolean search(Node head,int x){
        Node current=head;
        while(current != null){
            if(current.data == x){
                return true;
            }
                current=current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        searchElementLL list=new searchElementLL();
        int x=50;
        
        list.push(10);
        list.push(20);
        list.push(30);

        if(list.search(list.head,x)){
            System.out.print("Found");
        }
        else{
            System.out.print("Not found");
        }
    }
    
}
