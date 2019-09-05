package ArraysNStrings;

import java.util.*;
public class checkPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String input1 = scan.next();
		String input2 = scan.next();
		checkPermutations(input1,input2);
	}
	
	public static void checkPermutations(String input1,String input2)
	{
			char[] inp1 = input1.toCharArray();
			char[] inp2 = input2.toCharArray();
			
			if(inp1.length != inp2.length)
				System.out.println("lengths do not match");
			
			Arrays.sort(inp1);
			Arrays.sort(inp2);
			input1 = new String(inp1);
			input2 = new String(inp2);
			
			
			if(input1.equals(input2))
				System.out.println("Permutations of each other");;
					
	}
	
	

}
