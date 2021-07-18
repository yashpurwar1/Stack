package stack;

public class Runner {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.show();
		System.out.println();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println();		
		System.out.println(stack.peek());
		stack.pop();
		System.out.println();
		System.out.println(stack.peek());
		stack.pop();
		
		
	}

}
