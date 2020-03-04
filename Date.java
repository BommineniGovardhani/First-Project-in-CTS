import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatter.*;
import java.util.Formatter;
import java.text.ParseException.*;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat.*;
import java.util.Date;
import java.util.Locale;
public class Date {
	public static void main(String args[]){
		
	/*LocalDate date=LocalDate.now();
	System.out.println(date);
	LocalDate yes=date.minusDays(1);
	System.out.println(yes);
	LocalDate tomm=date.plusDays(3);
	System.out.println(tomm);
	LocalTime time=LocalTime.now();
	System.out.println("local time  :"+time);
	DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String formatDateTime=time.format(format);
	System.out.println(formatDateTime);
	LocalDate l=LocalDate.of(2020,2,29);
	System.out.println(l.isLeapYear());*/
	Date d=new Date();
	SimpleDateFormat format=new SimpleDateFormat("MM/dd/yyyy");
	String s=format.format(d);
	System.out.println(s);
	
}
}
	

