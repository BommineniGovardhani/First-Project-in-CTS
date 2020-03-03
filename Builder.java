/*.Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. It parses the string with the delimiter as ‘\’ and displays the String in the following format.
 Drive: c:\ 
Folders: IBM || DB2 || PROGRAM 
File: DB2COPY1.EXE 
Hint:  Use String Builder for concatenating the folder names with |
*/
import java.util.*;
class Builder{  
public static void main(String args[]){  
String s="C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
 
System.out.println(s);
System.out.println("Drive: " + s.substring(0, 3));

String s1=s.substring(3,18);


System.out.println("Folders: "+ s1.replace("\\","||"));
System.out.println("File: " + s.substring(19, 30));
	

}
}