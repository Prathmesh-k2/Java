import java.util.Scanner;
import java.util.Calendar;
class Date{
	private int day;
	private int month;
	private int year;
	
	
	public void iniDate(){
		 Calendar c = Calendar.getInstance(); 
		 day=c.get(Calendar.DATE);
		 month=c.get(Calendar.MONTH);
		 year=c.get(Calendar.YEAR);
	}
		
		 public void printRecord( ) {
			 System.out.println("Date :"+day);
			 System.out.println("Month :"+month);
			 System.out.println("Year :"+year);
				 
		 }
		 public void acceptReacord() {
			 Scanner sc=new Scanner(System.in);
			 System.out.print("Date : ");
			 day=sc.nextInt();
			 System.out.print("Month : ");
			 month=sc.nextInt();
			 System.out.print("Year : ");
			 year=sc.nextInt();
			 
	}
}
public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     
		Date d1=new Date();
		d1.iniDate();
		d1.printRecord();
		d1.acceptReacord();
		d1.printRecord();
		d1.iniDate();
		d1.printRecord();
		
	
	}

}
