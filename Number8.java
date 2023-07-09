public class Number8 {

	public static void main(String[] args) {
		int [] numbers = {1, 2, 3, 4, 5, 6};
		
		System.out.println ("Even numbers:");
		for (int number : numbers) {
			
			if (number % 2  == 0) {
				
				System.out.println(number);
			}
		}
		
	}

}
