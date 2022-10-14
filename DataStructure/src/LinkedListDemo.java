public class LinkedListDemo {

	private Node head;
	private Node tail;
	private int size;
	
	public class Node {
		private Object data;
		private Node next;
		
		
		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Object get(int index) {
		return getNode(index).data;
	}
	
	public Node getNode(int index) {
		if(index<0 || index >= size) {
			throw new IndexOutOfBoundsException("index:"+ index + "size:" + size);
		} else {
			Node node = head;
			for(int i=0; i<index; i++) {
				node = node.next;
			}	
			return node;
		}

	}
	
	public void addFirst(Object data) {
		Node newNode = new Node(data);
	
		newNode.next = head;
		head = newNode;
		
		size++;
		
		if(head.next == null) {
			tail = head;
		}
	}
	
	public void addLast(Object data) {
		Node newNode = new Node(data);
		
		if(size == 0) {
			addFirst(data);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	
	public void add(int index, Object data) {
		if(index == 0) {
			addFirst(data);
		} else if(index == size) {
			addLast(data);
		} else {
			Node newNode = new Node(data);
			Node prevNode = getNode(index-1);
			newNode.next = prevNode.next;
			prevNode.next = newNode;
		}
		
		size++;
	}
	
	public Object remove(int index) {
		Node prevNode = getNode(index-1);
		Node removeNode = prevNode.next;
		Node postNode = removeNode.next;
		prevNode.next = postNode;
		Object result = removeNode.data;
		removeNode = null;
		size--;
		
		return result;
	}
	
	
	public LinkedListDemo() {
		this.size = 0;
	}
	
	public static void main(String[] args) {
		
		LinkedListDemo linked = new LinkedListDemo();
		
		linked.addFirst("1번");
		linked.addFirst("2번");
		linked.addFirst("3번");
		linked.addLast("4번");
		linked.add(1, "5번");
		
		linked.remove(1);

		System.out.println(linked.get(0));
		System.out.println(linked.get(1));
		System.out.println(linked.get(2));
		System.out.println(linked.get(3));
	}

}
