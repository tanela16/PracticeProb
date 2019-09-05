//String Compression: Implement a method to perform basic string compression using the counts
//of repeated characters. For example, the string aabcccccaaa would become a2blc5a3, If the
//"compressed" string would not become smaller than the original string, your method should return
//the original string. You can assume the string has only uppercase and lowercase letters (a - z).

package ArraysNStrings;

import java.util.Scanner;

public class stringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String input1 = scan.next();
		stringCompression(input1);
		//abcd;
		//aabbbbbccdd;
	}
	
	
	public static void stringCompression(String input1){
		char[] inp1 = new char[input1.length()];
		int i=0,j=0,k=0,cnt=0;
		boolean len=true;
		
		while(j<input1.length())
		{
			if(input1.charAt(i)==input1.charAt(j))
				{ 
				cnt++;
				j++;			 
				}
			else if(input1.charAt(i)!=input1.charAt(j)){
				inp1[k]=input1.charAt(i);
				k++;
				if(cnt>1)
					len=false;
				inp1[k]= (char)(cnt+'0');  
				k++;
				i=j;
				cnt=0;			
			}
			
			if(j==input1.length()){
				inp1[k]=input1.charAt(i);
				k++;
				if(cnt>1)
					len=false;
				inp1[k]= (char)(cnt+'0');  
				}
		}
		
		System.out.println(new String(inp1));
	}

}
