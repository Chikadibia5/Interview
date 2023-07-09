

public class removeDuplicates2 {

	public static String removeDuplicate(String str) {
		StringBuilder result = new StringBuilder();
		boolean[] visited = new boolean [Character.MAX_VALUE +1];
		
		for (int  i =0; i < str.length(); i ++) {
			char currentChar = str.charAt(i);
			if (!visited[currentChar]) {
				result.append(currentChar);
				visited[currentChar] = true;
			}
		}
		return result.toString();
	}
		public static void main (String[]args) {
		String str1  = "Hello";
		String  str2 = "Concatenate";
		
		
		String result1 = removeDuplicate(str1);
		String result2 = removeDuplicate(str2);
		
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
