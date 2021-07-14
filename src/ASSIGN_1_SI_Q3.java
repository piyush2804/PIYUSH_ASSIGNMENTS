import java.util.Scanner;

public class ASSIGN_1_SI_Q3 {

	public static void main(String[] args) {
		float p,r,t,SI,CI;
		Scanner sc=new Scanner(System.in);
		p=sc.nextFloat();
		r=sc.nextFloat();
		t=sc.nextFloat();
		SI=p*r*t;
		CI=p*(float)Math.pow((1+r),t)-p;
		System.out.println("SI:"+SI+"\nCI:"+CI);

	}

}
