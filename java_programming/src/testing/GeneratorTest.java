package testing;


public class GeneratorTest {

	public static void main(String args[]){
		
		Generator g = Generator.getInstance();
		
		for(int i = 0; i < 10; i++){
			System.out.println(g.randomNumber(65, 91, true));
		}
		
		Integer randoms[] = g.randomNumberArray(1, 100, true, 15);
		
		for(int i = 0; i < randoms.length; i++){
			System.out.println(randoms[i]);
		}
		
		String s = g.randomStringAlpha(25);
		System.out.println(s);
		
	}
}
