
public class MyArrayList<E> {
	Object[] data;
	int capacity;
	int num;
	static final int startingCapacity = 10;

	public MyArrayList(){
		this(startingCapacity);
	}

	public MyArrayList (int capacity){
		this.capacity = startingCapacity;
		data = new Object [capacity];
		num = 0;
	}

	public void clear(){
		for (int i = 0; i < data.length; i++){
			data[i] = null;
		}
		capacity = startingCapacity;
		num = 0;
	}

	@SuppressWarnings("unchecked")
	public E get(int index){
		return (E) data[index];
	}

	@SuppressWarnings("unchecked")
	public E remove(int index){
		E item = (E) data[index];
		for (int i = index; i < num-1; i++){
			data[i] = data[i+1];
		}
		data[num-1] = null;
		num--;
		return (E) item;
	}

	public int size(){
		return num;
	}

	public void add(E a){
		if (num == capacity - 1){
			Object[] newData = new Object[capacity + startingCapacity];
			for (int i = 0; i <= num; i++){
				newData[i] = data[i];
			}
			data = newData;
			capacity = capacity + 10;
		}
		data[num] = a;
		num++;
	}	
}
