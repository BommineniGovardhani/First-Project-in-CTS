import java.util.Arrays;
import java.util.List;
import java.util.*;
public class CountrySorter {

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
sortCountries(list);
System.out.println(list);
}
public static ArrayList<String> sortCountries(ArrayList<String> list)
 {
Collections.sort(list);
return list;
  }
}
    