import java.util.*;
public class Assign1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int i;
for( i=0;i<s.length();i++)
{
	int c=0;
	for(int j=i;j<s.length();j++)
	{
	if(s.charAt(i)==s.charAt(j))
	{
		c++;
	}	
	}
	
	if(c==1)
	{
		System.out.println(i);
		break;
	}
	}
	
	}
	}

	
	


