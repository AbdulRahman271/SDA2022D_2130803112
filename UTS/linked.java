package UTS;
import java.io.*;

public class linked {
Node head; 
static class Node {
int data;
Node next;
Node(int d)
		{
			data = d;
			next = null;
		}
	}
      public static linked insert(linked list, int data)
	{
	  Node new_node = new Node(data);
	  if (list.head == null) {
	      list.head = new_node;}
		else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			    last.next = new_node; }
          return list;
	}
        public static void printList(linked list)
	{
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		while (currNode != null) {
	    System.out.print(currNode.data + " ");
		currNode = currNode.next;
		} }
        public static void main(String[] args)
	{
		linked list = new linked();
		list = insert(list, 10);
		list = insert(list, 20);
		list = insert(list, 30);
		list = insert(list, 40);
		list = insert(list, 50);
		printList(list); }}

