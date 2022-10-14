
public class ArrayListDemo {
	
	private int size; // 더해진 데이터의 사이즈
	private int capacity; // 초기 용량
	private int currentC; // 현재 용량
	private Object[] ArrList;
	
	
	
	/*
	 * 구현할 methods
	 * get() : index에 저장된 데이터 리턴
	 * add() : 배열의 마지막에 data 저장
	 * add(index, data) : index번째에 data 저장
	 * remove() : index에 저장된 데이터 삭제, 리턴
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
	
	public int arrSize() { // 현재 max size 리턴
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

		arrList.add("1번");
		arrList.add("2번");
		arrList.add("3번");
		arrList.add("4번");
		arrList.add("5번");
	
		System.out.println(arrList.remove(0));
		System.out.println(arrList.get(0));
		System.out.println(arrList.arrSize());
		
		arrList.add("6번");
		arrList.add("7번");
		System.out.println(arrList.arrSize());
	}

}
