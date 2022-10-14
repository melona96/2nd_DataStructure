public class StackDemo {
	private int top;
	private int size;
	private Object stackArr[];
	
	/*
	 * push() 값 넣기
	 * pop() 값 return과 동시에 제거
	 * peek() 맨 위의 값 return
	 * isEmpty() 스택이 비었다면 true / false
	 * isFull() 스택이 가득찼다면 true / false
	 * size() 스택이 가진 원소 개수 출력
	 */
	
	public boolean isEmpty( ) {
		return (top == -1);  // 배열은 아무 값도 들어있지 않으면 -1을 가르키므로 top 이 -1 인지 체크함.
	}
	
	public boolean isFull() {
		return (top == size-1); //
	}
	
	public int size() {
		return (top + 1);
	}
	
	public void push(Object data) {
		if(isFull()) {
			System.out.println("Stack is Full"); //
		} else {
			stackArr[++top] = data;
		}
	}
	
	public Object peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		} else {
			return stackArr[top];
		}
	}
	
	public Object pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		} else {
			return stackArr[top--];
		}
	}
	
	
	public StackDemo(int size) {
		this.size = size;
		this.top = -1;
		this.stackArr = new Object[size];
	}
	
	public static void main(String[] args) {
		StackDemo stack = new StackDemo(5);
		
		stack.push("남내진");
		stack.push("손흥민");
		stack.push("박지성");
		stack.push("차범근");
		stack.push("차범근2");
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
	}

}
