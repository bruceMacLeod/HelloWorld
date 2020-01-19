import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello {

	public static void displayMemory() 
	{
		int mb = 1024*1024;
        
        //Getting the runtime reference from system
        Runtime runtime = Runtime.getRuntime();
         
        System.out.println("##### Heap utilization statistics [MB] #####");
         
        //Print used memory
        System.out.println("Used Memory:"
            + (runtime.totalMemory() - runtime.freeMemory()) / mb);
 
        //Print free memory
        System.out.println("Free Memory:"
            + runtime.freeMemory() / mb);
         
        //Print total available memory
        System.out.println("Total Memory:" + runtime.totalMemory() / mb);
 
        //Print Maximum available memory
        System.out.println("Max Memory:" + runtime.maxMemory() / mb);
	}
	
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
		displayMemory();
		PostAmble.sayGoodBye();
		System.out.println("Hello Charlie");
		System.out.println("Hello David");
		
	}

}
