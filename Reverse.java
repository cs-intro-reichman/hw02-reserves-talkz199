public class Reverse {
	public static void main(String[] args) {
	   
	   String str = args[0];
		   int n = str.length();
		   int mid = ( n / 2);
		   
   
		   System.out.println(str.charAt(mid) );
   
		for (int i = n - 1; i >= 0; i-- ){
	   System.out.print("The middle character is " + str.charAt(i));
   
	   
	   }
	  
	}  
   }