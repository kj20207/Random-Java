package testing.structures.queues;
import structures.queues.*;

public class QueueTest {

	public static void main(String args[]){
		Queue q = new Queue();

		for(int i = 0; i < 5; i++){
			q.queue(i+1);
			System.out.print(q.peek() + " ");
		}

		System.out.println();

		for(int i = q.size(); i > 0; i--){
			System.out.print(q.dequeue().getValue() + " ");
		}
	}

}
