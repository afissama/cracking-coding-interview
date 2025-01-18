public class M_ArrayList<T> {
	private T[] values;
	private int size;
	
	public M_ArrayList() {
	  size = 0;
		values = (T[]) new Object[10];
	}
	
	public T[] resize() {
	  T[] newA = (T[]) new Object[size*2];
	  for(int i=0; i<size; i++) {
	    newA[i] = values[i];
	  }
	  return newA;
	}
	
	public void add(T value) {
	  if (size == values.length) {
	    values = resize();
	  }
	  values[size] = value;
	  size++;
	}
	
	public T get(int index){
	  if (index >= 0 && index < size) {
	    return values[index];
	  }
    return null;
	}
	
	public T remove(int index) {
	  if (index < 0 || index >= size) {
	    return null;
	  }
	  T value = values[index];
	  for(int i=index; i<size-1; i++) {
	    values[i] = values[i+1];
	  }
	  values[size - 1] = null;
	  size--;
	  return value;
	}
	
	public int getSize() {
	  return size;
	}
}
