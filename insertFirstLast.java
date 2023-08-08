class insertFirstLast{
    Node head; 
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    //add first
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head == null){    //if it is empty,we create a new node and return that node.
            head=newNode;
            return;
        }
        newNode.next=head;   //to add the node at starting position
        head=newNode;  //we assign the newNdoe as head 
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head == null){    //if it is empty,we create a new node and return that node.
            head=newNode;
            return;
        }
        Node currNode =head;
        while(currNode.next !=null){ //traversing
            currNode=currNode.next;
        }
        currNode.next=newNode;  //adding newNode at last
    }

    //printLL

    public void printList(){
        if(head == null){
            System.out.print("List is empty");
        }
        Node currNode =head;
        while(currNode !=null){ //traversing
            System.out.print(currNode.data +"->");
            currNode=currNode.next;
        }
        System.out.println(" NULL ");

    }

    public static void main(String[] args) {
        insertFirstLast list=new insertFirstLast();
        list.addFirst(" a ");
        list.addFirst(" is ");
        list.printList();

        list.addLast(" list ");
        list.printList();

        list.addFirst(" this ");
        list.printList();

    }
}
