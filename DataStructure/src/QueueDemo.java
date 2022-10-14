public class QueueDemo {
	
	private int front;
	private int rear;
	private int size;
	private Object queue[];
	
	public boolean isEmpty() {
		if(front == rear) {
			front = -1;
			rear = -1;
		}	
		return (front == rear);
	}
	
	public boolean isFull() {
		return (rear == this.size-1);
	}
	
	public void offer(Object data) {
		if(isFull()) {
			System.out.println("Queue is full");
		} else {
			queue[++rear] = data;
		}
	}
	
	public Object poll() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		} else {
			front = (front + 1) % this.size;
			
			return queue[front];
		}
	}
	
	public Object peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		} else {
			return queue[front+1];
		}
	}
	
	public int size() {
		return rear+1;
	}
 	
	public QueueDemo(int size) {
		this.front = -1;
		this.rear = -1;
		this.size = size;
		this.queue = new Object[size];
	}
	
	
	public static void main(String[] args) {
		
		QueueDemo queue = new QueueDemo(5);
		
		queue.offer("¸¶¸°");
		queue.offer("¸Þµñ");
		queue.offer("ÆÄÀÌ¾î¹î");
		queue.offer("ÅÊÅ©");
		queue.offer("¹úÃÄ");
		

		System.out.println(queue.peek());
		
		System.out.println(queue.poll());
		
		System.out.println(queue.peek());
		
	}

}
