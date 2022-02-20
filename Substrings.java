import java.util.Scanner;

public class Substrings {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String str= scan.nextLine();
		int len=str.length();
		for(int i=0;i<=len-1;i++){
		for(int j=i;j<=len-1;j++){	
		for(int k=i;k<=j;k++){
			
			
		System.out.print(str.charAt(k));
		}
		System.out.println();
	}
		}
}
}
		

	
	

