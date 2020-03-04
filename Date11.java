import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.time.LocalDateTime.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatter.*;
import java.util.Formatter;
import java.text.ParseException.*;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
public class Date11 {
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
	SimpleDateFormat format1=new SimpleDateFormat("EEEE,dd MMMM yyyy zzzz HH:mm:ss ");
	String s=format1.format(d);
	System.out.println(s);
	Calendar c=Calendar.getInstance();
	System.out.println(c.getTime());
	c.add(Calendar.DATE,-18);
	System.out.println(c.getTime());
	c.add(Calendar.DATE,5);
	System.out.println(c.getTime());
	c.add(Calendar.MONTH,4);
	System.out.println(c.getTime());
	c.add(Calendar.YEAR,1);
	System.out.println(c.getTime());
	c.get(Calendar.YEAR);
	System.out.println(c.getTime());
	c.get(Calendar.DATE);
	System.out.println(c.getTime());
	Clock c1=Clock.systemDefaultZone();
	System.out.println(c1.getZone());
	Year y=Year.of(2020);
	LocalDate l1=y.atDay(156);
	
	System.out.println(l1);
	LocalDate l=l1.withMonth(10);
	System.out.println(l);
	MonthDay m=MonthDay.now();
	LocalDate d1=m.atYear(2010);
	System.out.println(d1);
	
	
	
}
}
	

