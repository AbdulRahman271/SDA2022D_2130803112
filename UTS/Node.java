package UTS;


    public class Node {
    
        private int data;
        Node next;
    
        public Node(int data){
            this.data = data;
        }
    
        public void tampil(){
            System.out.print(data+" ");
        }
    }



class LinkedList {

    private Node first ;

    public LinkedList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void addFirst(int data){
        Node node = new Node(data);
        node.next = first;
        first = node;
    }

   
    
    

    // menampilkan isi linked list
    public void print(){
        Node current = first;
        if(current == null){
            System.out.println("Kosong!");
        }else{
            while(current != null){
                current.tampil();
                current = current.next;
            }
            System.out.println();
        }
    }
}



class LinkedListApp {
    public static void main(String[] args) {

        LinkedList link = new LinkedList();
        link.addFirst(50);
        link.addFirst(40);
        link.addFirst(30);
        link.addFirst(20);
        link.addFirst(10);     
        link.print();
    }
}

