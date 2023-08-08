import java.util.*;
public class byCollectionframeWork {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.addFirst("is");
        list.addFirst("name");
        System.out.println(list);

        list.addFirst("My");
        list.addLast("Aryan");
        System.out.println(list);
        System.out.println(list.size());

        //to print LL
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) +" -> ");
        }
        System.out.println(" NULL ");



        list.removeFirst();
        System.out.println(list);

        list.remove();
        System.out.println(list);


        // list.remove(3);
        //  System.out.println(list);
        
    }
}
