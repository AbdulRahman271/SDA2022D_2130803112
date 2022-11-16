package pertemuan9;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[]args) {
        Queue<String>queue= new LinkedList<String>();
        queue.offer("didi");
        queue.offer("danu");
        queue.offer("didit");
        queue.offer("dadang");
        System.out.println(queue);
        

        System.out.println(queue.contains("dadang"));
        
    }
    
}
