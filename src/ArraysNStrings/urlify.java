package ArraysNStrings;

import java.util.Scanner;

public class urlify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter string");
		String input1 = "mr 3ohn Smith    ";
		//System.out.println("Enter true length");
		int lenInp = 13;
		urliFY(input1,lenInp);
	}
	
	public static void urliFY(String inp,int lenInp){
		char[] inp1 = inp.toCharArray();
		for(int j=lenInp-1, i= inp1.length-1 ;j>=0;j--)
		{
			if(inp1[j] ==' ')
			{
				inp1[i]='0';
				inp1[i-1]='2';
				inp1[i-2]='%';
				i=i-2;
			}
			else 
				inp1[i]=inp1[j];
			i--;
			
		}
		
		System.out.println(new String(inp1));
	}

}
