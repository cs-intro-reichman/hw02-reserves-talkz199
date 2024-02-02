public class InOrder {
	public static void main(String[] args) {
	   
	   
	  int x0 = (int)(10 + Math.random()* (-10));
	  int x1 = (int)(10 + Math.random()* (-10)); 
	  
	  System.out.print( x0 + " " ); 
		  while (x1>x0) {
			System.out.print( x1+ " " ); 
			x0 = x1 ;
			 x1 = (int)(10 + Math.random()* (-10)); 
		  
		  }
	
	}  
   }
   