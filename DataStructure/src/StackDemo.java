public class StackDemo {
	private int top;
	private int size;
	private Object stackArr[];
	
	/*
	 * push() �� �ֱ�
	 * pop() �� return�� ���ÿ� ����
	 * peek() �� ���� �� return
	 * isEmpty() ������ ����ٸ� true / false
	 * isFull() ������ ����á�ٸ� true / false
	 * size() ������ ���� ���� ���� ���
	 */
	
	public boolean isEmpty( ) {
		return (top == -1);  // �迭�� �ƹ� ���� ������� ������ -1�� ����Ű�Ƿ� top �� -1 ���� üũ��.
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
		
		stack.push("������");
		stack.push("�����");
		stack.push("������");
		stack.push("������");
		stack.push("������2");
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
	}

}
