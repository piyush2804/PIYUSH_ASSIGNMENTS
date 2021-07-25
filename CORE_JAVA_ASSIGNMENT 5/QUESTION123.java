import java.util.LinkedList;
import java.util.List;

public class QUESTION123 {

	public static void main(String[] args) {
		List<Fruit> fruitList=new LinkedList<>();
		
		fruitList.add(new Fruit("Apple", 175, 150, "Red"));
		fruitList.add(new Fruit("Mango", 60, 70, "Yellow"));
		fruitList.add(new Fruit("Banana", 95, 30, "Yellow"));
		fruitList.add(new Fruit("Strawberry", 90, 170, "Red"));
		fruitList.add(new Fruit("Orange", 120, 90, "Orange"));
		fruitList.add(new Fruit("Guava", 200, 70, "Green"));
		fruitList.add(new Fruit("Lemon", 50, 30, "Green"));
		
		//QUESTION 1
		fruitList.stream().
		filter((x)->{ 
			if(x.getCalories()<100)
			{
				return true;
			}
			else
			{
				return false;
			}
		} ).sorted((a,b)->b.getCalories()-a.getCalories()).forEach(System.out::println);
		System.out.println("--------------------------------------------------------------");
		//	QUESTION2
		fruitList.stream().
		sorted((a,b)->b.getColor().compareTo(a.getColor())).forEach(System.out::println);
		System.out.println("--------------------------------------------------------------");
		// QUESTION3
		fruitList.stream().
		filter((x)->{ 
			if(x.getColor().equalsIgnoreCase("red"))
			{
				return true;
			}
			else
			{
				return false;
			}
		} ).sorted((a,b)->a.getPrice()-b.getPrice()).forEach(System.out::println);
		
	}

}
