public class Perfect {

	public static void main(String[] args) {
	//declire number to the check
	int num = Integer.parseInt(args[0]);
	int i=0;
	int sum = 0;
	 // create an array to store divisors
		  String[] arr =new String[num] ;
	 // enter all dviders to a args and create a sum of them
		for (int d=1; d < num; d++){
			 if (num % d == 0) {
			   arr[i]  = Integer.toString(d);
				sum = sum + d;
				i++;
			 }        
			}
	//check if the the number is equal to the sum of the divisors
	if (num == sum) {
		System.out.print( num + " is a perfect number since = ");
			for(int a=0; a < i - 1 ;a++)
			{
				System.out.print(arr[a] + " + ");
			}
			System.out.print(arr[i-1]);
		}
	
	else{
		System.out.println( num + " is not a perfect number");
		}
		System.out.println();
		}
	}