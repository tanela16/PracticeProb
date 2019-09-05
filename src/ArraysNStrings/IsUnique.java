/*Implement algo to determine if string has unique characters,break and declare*/

package ArraysNStrings;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String input1 = scan.next();
		if( hashIt(input1))
		System.out.println("All characters unique");
		else
		 System.out.println("Charaters repeat");

	
	}

	//Brute force
	public static boolean brute(String input){
	for(int i=0;i<input.length();i++)
	{
		for(int j=0;j<input.length();j++){
			if(input.charAt(i) == input.charAt(j))
				return false;	
		}	
	}
		
		return true;
	}	
	
	//Data Structure
	public static boolean hashIt(String input){
		 HashSet<Character> storeInp = new HashSet();
		 for(int i=0;i<input.length();i++)
		 {
			 if(!storeInp.add(input.charAt(i)))
				 return false;			 
		 }
		return true;
	}
	
	//char conversion
	public static boolean checkIt(String input){
		int checkIt = 0;
		for(int i=0;i<input.length();i++){
		int checkInput = input.charAt(i) - 'a';
		if((checkIt & (1<<checkInput)) > 0) return false;
		}
		return true;
	}

}


