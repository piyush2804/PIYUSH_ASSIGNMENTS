import java.util.Scanner;

public class QUESTION5 {
	public static void main(String[] args) {
		double pack,tax=0;
		Scanner sc=new Scanner(System.in);
		pack=sc.nextDouble();

		if(pack>=0&&pack<=180000)
		{
			tax=0;
		}
		else if(pack>180000&&pack<=300000)
		{
			tax=0.1*pack;
		}
		else if(pack>300000&&pack<=500000)
		{
			tax=0.2*pack;
		}
		else if(pack>500000&&pack<=1000000)
		{
			tax=0.3*pack;
		}
		System.out.println(tax);

	}


}
