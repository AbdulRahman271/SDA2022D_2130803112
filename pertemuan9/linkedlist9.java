package pertemuan9;

import java.util.LinkedList;

public class linkedlist9 {
    public static void main(String[]args) {

     LinkedList <String> linkedlist =new LinkedList <String>();
     linkedlist.push("A");
     linkedlist.push("B");
     linkedlist.push("C");
     linkedlist.push("D");
     linkedlist.push("F");
     linkedlist.add(4,"E");
     linkedlist.remove("E");

     System.out.println(linkedlist.peekFirst());
     System.out.println(linkedlist.peekLast());
     linkedlist.addFirst("0");
     linkedlist.addLast("G");

     linkedlist.removeFirst();


     
    

    
    
    
     System.out.println(linkedlist);

        
    }
    
}
