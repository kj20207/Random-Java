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

		int random = Generator.rand.nextInt() % max + min;
		if(pos)
			return Math.abs(random); 
		else return random;
	}
	
	public Integer[] randomNumberArray(int min, int max, boolean pos, int size){
		Integer randomNumbers[] = new Integer[size];
		
		for(int i = 0; i < size; i++){
			randomNumbers[i] = new Integer(randomNumber(min, max, pos));
		}
		
		return randomNumbers;
	}

	public String randomString(int length){
		if(length < 1){
			return "";
		}
		else{
			String random = "";
			return random;
		}
	}
}