public class palidromeLL {
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
            System.out.print("Empty");
        }
        else{
            while(current != null){
                System.out.print(current.data +" -> ");
                current=current.next;
            }
            System.out.print("NULL");
        }
    }

    public Node reverse(Node head){
        Node prev=null;
        Node current=head;
        Node next=null;

        while(current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return head=prev;
    }

    public Node findmiddle(Node head){
        Node hare=head;
        Node turtle=head;
        while(hare.next != null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }

    public boolean isPalindrome(Node head){
        if(head == null || head.next==null){
            return true;
        }
        Node middle =findmiddle(head);
        
        Node firstHalfStart=head;
        Node secondHalfStart=reverse(middle.next);

        while(secondHalfStart != null){
            if(firstHalfStart.data != secondHalfStart.data){
                return false;
            }
            firstHalfStart=firstHalfStart.next;
            secondHalfStart=secondHalfStart.next;
        }
        return true;
    }

    public static void main(String[] args) {
        palidromeLL list=new palidromeLL();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(10);
        list.printLL();

        boolean isPalindrome=list.isPalindrome(list.head);
        System.out.println("\nIs the linked list a palindrome? " + isPalindrome);
        
    }
}
