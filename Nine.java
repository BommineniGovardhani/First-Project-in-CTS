import java.util.Arrays;
import java.util.List;
import java.util.*;
public class Nine {

    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] s=new int[n];
for(int i=0;i<n;i++)
{
s[i]=sc.nextInt();
}

ArrayList<Integer> list=new ArrayList<Integer>();
for(int i=0;i<n;i++)
list.add(s[i]);
getArrayList(list);
getArray(list);
System.out.println(list);
    }
public static ArrayList<Integer> getArrayList(ArrayList<Integer> list)
{

return list;
  }
public static ArrayList<Integer> getArray(ArrayList<Integer> list)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
{
	list.add(new Integer(i));
}
return list;
}
}

    