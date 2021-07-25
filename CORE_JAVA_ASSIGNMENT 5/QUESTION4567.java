import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class QUESTION4567 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<News> newsList=new LinkedList<News>();

		newsList.add(new News(1, "PIYUSH", "BUDGET", "Very good"));
		newsList.add(new News(2, "IS", "BUDGET", "Properly executed"));
		newsList.add(new News(3, "MY", "EXCELLENT", "Very well written"));
		newsList.add(new News(4, "NAME", "EXCELLENT", "Amazing insight into the story"));
		newsList.add(new News(5, "HELLO", "EXCELLENT", "Poor report"));
		newsList.add(new News(6, "IAM", "GOOD", "Fantabulous"));
		newsList.add(new News(7, "PRBLMCHILD", "GOOD", "Super creativity"));
	//	System.out.print(newsList);  QUESTION 4
	System.out.println(newsList.stream()
				.max((o1,o2)->o1.getComment().length()-o2.getComment().length()).get());
	//QUESTION 5
	System.out.println("BUDGET IN NEWS COMMENTS BY USER\t"+newsList.stream().filter((x)->x.getCommentByUser().equalsIgnoreCase("BUDGET")).count());
	
//    System.out.println("No.of times the word budget has been mentioned in comments :\n");
//	newsList.stream()
//	.filter(n->n.getComment().contains("budget"))
//	.forEach(n->System.out.println(n.getCommentByUser()));
	
	//QUESTION 6
	System.out.println(newsList.stream().max(Comparator.comparing(News::getCommentByUser)));
	//QUESTION 7
	}

}
