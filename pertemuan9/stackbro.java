package pertemuan9;
import java.util.Stack;

public class stackbro {
    public static void main(String[]args) {
    Stack<String> stack = new Stack<String>();
    stack.push("ML");
    stack.push("Cod");
    stack.push("PUBG");
    stack.push("PES 2021");
    stack.push("FIFA");
    
    
    System.out.println(stack.search("FIFA"));

    }
    
    
}
