package structures.nodes;

public abstract class Node {
	
	private int value;
	
	public Node(int value){
		this.value = value;
	}
	
	public boolean setValue(int value){
		if(this.value == value){
			return false;
		}
		else this.value = value;
		return true;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public int compare(Node n2){
		if(this.getValue() > n2.getValue()){
			return 1;
		}
		else if(this.getValue() == n2.getValue()){
			return 0;
		}
		else return -1;
	}

	
}
