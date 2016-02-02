import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello {

	public static void displayDate() 
	{
		DateFormat dateFormat = new SimpleDateFormat(" yyyy/MM/dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2014/08/06
	}
	
	public static void main(String[] args) 
	{
		PreAmble.amble();
		System.out.println("Hello, My name is Bruce B MacLeod");
		displayDate();
		PostAmble.sayGoodBye();
	}

}
