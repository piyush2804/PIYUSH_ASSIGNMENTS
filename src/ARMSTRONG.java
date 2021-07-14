import java.util.*;
public class ARMSTRONG {
	public static void main(String []args)
	{
		int num,x=0,sol=0,y,degree=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		y=num;
		while(num!=0)
		{
			degree++;
			num=num/10;
		}
		num=y;
		while(num!=0)
		{
			x=num%10;
			sol= sol+ (int) Math.pow(x, degree);
			num=num/10;
		}
		if(sol==y)
		{
			System.out.println(sol+"\nnumber is armstrong");
		}
	}

}
