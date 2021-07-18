package stack;
import java.util.*;
public class Stack {
	MyNode head;
	Stack(){
		this.head=null;
	}
	public void push(int data) {
		 MyNode temp = new MyNode();
	        temp.data = data;
	        temp.next = head;
	        head = temp;
	}
	
	public void pop() {
		head = (head).next;
	}
	
	public boolean isEmpty()
    {
        return head == null;
    }
	
	public int peek()
    {
        if (!isEmpty()) {
            return head.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
	public void show() {
		MyNode node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}

}
