
public class ArrayListDemo {
	
	private int size; // ������ �������� ������
	private int capacity; // �ʱ� �뷮
	private int currentC; // ���� �뷮
	private Object[] ArrList;
	
	
	
	/*
	 * ������ methods
	 * get() : index�� ����� ������ ����
	 * add() : �迭�� �������� data ����
	 * add(index, data) : index��°�� data ����
	 * remove() : index�� ����� ������ ����, ����
	 */
	
	public Object get(int index) {
		return ArrList[index];
	}
	
	public void add(Object data) {
		if(size >= currentC) {
			Object[] newArr = new Object[currentC * 2];
			
			for(int i=0; i<size; i++) {
				newArr[i] = ArrList[i];
				ArrList = newArr;
			} 
			
			currentC = currentC * 2;			
		} 
		
		ArrList[size++] = data;
	}
	
	public void add(int index, Object data) {
		for(int i=size-1; i>=index; i--) {
			ArrList[i+1] = ArrList[i];
		}
		ArrList[index] = data;
		
		size++;
	}
	
	public Object remove(int index) {
		Object removed = ArrList[index];
		
		for(int i=index+1; i<=size-1; i++) {
			ArrList[i-1] = ArrList[i];
		}
		size--;
		ArrList[size] = null;
		return removed;
	}
	
	public int arrSize() { // ���� max size ����
    	return currentC;
    }
	
	
	public ArrayListDemo() {
		this.size = 0;
		this.capacity = 10;
		this.currentC = capacity;
		ArrList = new Object[capacity];
	}
	
	public ArrayListDemo(int capacity) {
		this.size = 0;
		this.capacity = capacity;
		this.currentC = capacity;
		ArrList = new Object[capacity];
	}
	
	public static void main(String[] args) {
		
		ArrayListDemo arrList = new ArrayListDemo(5);
		//ArrayListDemo arrList2 = new ArrayListDemo();

		arrList.add("1��");
		arrList.add("2��");
		arrList.add("3��");
		arrList.add("4��");
		arrList.add("5��");
	
		System.out.println(arrList.remove(0));
		System.out.println(arrList.get(0));
		System.out.println(arrList.arrSize());
		
		arrList.add("6��");
		arrList.add("7��");
		System.out.println(arrList.arrSize());
	}

}
