import java.util.*;
public class QUESTION7 {
			public static void main(String []args)
			{
				int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
				int count=0;
				Scanner sc=new Scanner(System.in);
				int x=sc.nextInt();
				for(int i=0;i<15;i++)
				{
					if(x==arr[i])
					{
						System.out.println(i);
						count=1;
					}
				}
				if(count==0)
				{
					System.out.println("not in the arrray");
				}
			}
}
