public class DamkaBoard {

	public static void main(String[] args) {
	int t = Integer.parseInt(args[0]);
	for (int i = 0; i < t; i++)
	{
		for (int a =0; a < t ;a++)
		{
			System.out.print("* ");
		}
		System.out.println(" ");
		if(i%2 == 0){
			 System.out.print(" ");
		}
	}
		}
	}


