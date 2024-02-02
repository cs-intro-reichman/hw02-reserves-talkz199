public class Reverse {
	public static void main(String[] args) {
	   
	   String str = args[0];
		   int n = str.length();
		   int mid = ( n / 2);
		   
		   for (int i = n - 1; i >= 0; i-- ){
			System.out.print(str.charAt(i));
		   }
		   System.out.println();
		   System.out.println("The middle character is " + str.charAt(mid) );
	}  
   }