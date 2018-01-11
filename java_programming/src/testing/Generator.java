package testing;
import java.util.Random;
import java.lang.Math;

public class Generator {

	private static Generator generator;
	private static Random rand;
	
	public static Generator getInstance(){
		if(generator == null){
			generator = new Generator();
			rand = new Random();
		}
		return generator;
	}

	public int randomNumber(int min, int max, boolean pos){
		if (min > max)
			return 0;
		if(min == max)
			return min;

		int random = Generator.rand.nextInt();
		
		if(pos){
			random = Math.abs(random % (max - min)); 
			return random + min;
		}
		
		if(random > 0)
			return random + min;
		else return random - min;
	}

	public Integer[] randomNumberArray(int min, int max, boolean pos, int size){
		Integer randomNumbers[] = new Integer[size];

		for(int i = 0; i < size; i++){
			randomNumbers[i] = new Integer(randomNumber(min, max, pos));
		}

		return randomNumbers;
	}

	public String randomStringAlpha(int length){

		Integer[] random = randomNumberArray(0, 2, true, length);
		String s = "";
		for(int i = 0; i < length; i++){

			int a;
			if(random[i] == 1){
				a = randomNumber(65, 91, true);
				s += (char) a;
			}
			else{
				a = randomNumber(97, 123, true);
				s += (char) a;
			}
		}

		return s;

	}
	
	public static void printArray(String header, Integer nums[]){
		System.out.print(header);
		for(int i = 0; i < nums.length; i++){
			if(i > 0){
				System.out.print(", ");
			}
			System.out.print(nums[i]);
		}
		System.out.println();
	}
	
}