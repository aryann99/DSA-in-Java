public class sortLL {
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

    public Node middleofLL(Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null && slow!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public Node sortList(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node middle=middleofLL(head);
        Node nextOfmiddle=middle.next;
        
        middle.next=null;

        Node left=sortList(head);
        Node right=sortList(nextOfmiddle);

        return merge(left,right);
    }

    public Node merge(Node left,Node right){
        Node result = new Node(0);
        Node current = result;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null)
            current.next = left;
        else if (right != null)
            current.next = right;

        return result.next;
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
        sortLL list=new sortLL();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("Original List:");
        list.printLL();

        list.head = list.sortList(list.head);

        System.out.println("Sorted List:");
        list.printLL();
    }
}
