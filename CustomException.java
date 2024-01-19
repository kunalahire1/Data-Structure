import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	      System.out.print("Enter amount");
	    int amnt=sc.nextInt();
	  
	    try{
	    limitCross(amnt);
	    }
	    catch(Exception e)
	    {
	        System.out.print(e);
	    }
	
	
	}
	static void limitCross(int amnt) throws DailyLimitCrossed
	{
	    if(amnt>20000)
	    {
	        throw new DailyLimitCrossed("you reached daily limit\n");
	    }
	    else
	    {
	        System.out.print("Fine");
	    }
	}
}
class DailyLimitCrossed extends Exception{
    DailyLimitCrossed(String str)
{
    System.out.print(str);
}
}
