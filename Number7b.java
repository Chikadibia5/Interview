
public class Number7b {

	public static void main(String[] args) {
		int [] numbers = {34, 2, 9, 91, 19, 401, 0};
		
		System.out.println ("Odd numbers:");
		for (int number : numbers) {
			
			if (number % 2  != 0) {
				
				System.out.println(number);
			}
		}
		
	}

}

