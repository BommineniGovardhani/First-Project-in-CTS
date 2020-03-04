import java.time.LocalTime;
import java.util.Scanner;
import java.text.ParseException.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Local {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String d=sc.next();
		SimpleDateFormat l=new SimpleDateFormat("dd/MM/yyyy");
		//Comparable<Date> d=l.parse(d);
		System.out.println(d);
	}

}
