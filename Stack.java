package stack;

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
	public void show() {
		MyNode node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}

}
