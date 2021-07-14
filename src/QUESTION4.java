import java.util.Scanner;

public class QUESTION4 {
	public static void main(String[] args) {
		float p,c,m;
		String result="";
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		c=sc.nextInt();
		m=sc.nextInt();
		if(p>=60&&c>=60&&m>=60)
		{
			result="pass";
		}
		else if((p>=60&&c>=60)||(m>=60&&p>=60)||(c>=60&&m>=60))
		{
			result="Promoted";
		}
		else
		{
			result="Failed";
		}
		System.out.println(result);

	}

}
