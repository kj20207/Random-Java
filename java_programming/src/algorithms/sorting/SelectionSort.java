package algorithms.sorting;

public class SelectionSort <T extends Comparable <T>> extends Sort<T> {

	@Override
	protected T[] sortEqual(T[] arr, int comparing) {
		for(int i = 0; i < arr.length; i++){
			int choice = i;
			
			for(int j = i; j < arr.length; j++){
				if(arr[j].compareTo(arr[choice]) == comparing){
					choice = j;
				}
			}
	
			T tmp = arr[choice];
			arr[choice] = arr[i];
			arr[i] = tmp;
		}
		return arr;
	}

	@Override
	protected T[] sortRange(T[] arr, boolean asc) {
		// TODO Auto-generated method stub
		return null;
	}

}
