package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	private T[] array;
	
	public ArrayList() {
		array = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return array[loc];
	}
	
	public void add(T val) {
		T[] temparray = (T[]) new Object[array.length+1];
		for(int i = 0; i < array.length; i++) {
			temparray[i] = array[i];
		}
		temparray[temparray.length-1] = val;
		array = temparray;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] temparray = (T[]) new Object[array.length+1];
		for(int i = 0; i < loc; i++) {
			temparray[i] = array[i];
		}
		temparray[loc] = val;
		for(int i = loc+1; i < temparray.length; i++) {
			temparray[i] = array[i-1];
		}
		array = temparray;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] temparray = (T[]) new Object[array.length-1];
		for(int i = 0; i < loc; i++) {
			temparray[i] = array[i];
		}
		for(int i = loc; i < temparray.length; i++) {
			temparray[i] = array[i+1];
		}
		array = temparray;
	}
	
	public int size() {
		return array.length;
	}
	
	public boolean contains(T val) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == val) {
				return true;
			}
		}
		return false;
	}
}