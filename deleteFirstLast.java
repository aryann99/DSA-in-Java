public class deleteFirstLast {
    Node head;

    private int size;
    deleteFirstLast(){
         this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }


    public void deleteFirst(){
        if(head==null){
            System.out.print("The list is empty");
            return;
        }
        size--;
        head=head.next;
    }


    public void deleteLast(){
        if(head==null){
            System.out.print("The list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }

        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next != null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }

    public void printLL(){
        Node currNode=head;
        if(currNode==null){
            System.out.print("Empty");
        }
        while(currNode != null){
             
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }

        System.out.println("NULL");
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        deleteFirstLast list=new deleteFirstLast();
        list.addFirst("is");
        list.addFirst("a");
        list.printLL();

        list.addLast("list");
        list.printLL();

        list.addFirst("this");
        list.printLL();

        list.deleteFirst();
        list.printLL();

        list.deleteLast();
        list.printLL();

        System.out.println(list.getSize());
    }
    
}
