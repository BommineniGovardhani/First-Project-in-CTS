/*Create a class that can accept an array of String objects and  return them as a sorted List Class Name   : ListManager Method Name   : getArrayList Method Description  : Converts the String array to ArrayList and sorts it Argument  : String []elements  Return Type   : List- ArrayList containing the elements of the String array in sorted order Logic    : Load the elements in to an ArrayList and sort it. 
*/
import java.util.Arrays;
import java.util.List;
import java.util.*;
public class Collection2 {

    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String[] s=new String[n];
for(int i=0;i<n;i++)
{
s[i]=sc.next();
}

ArrayList<String> list=new ArrayList<String>();
for(int i=0;i<n;i++)
list.add(s[i]);
getArrayList(list);
System.out.println(list);
}
public static ArrayList<String> getArrayList(ArrayList<String> list)
 {
Collections.sort(list);
return list;
  }
}
    