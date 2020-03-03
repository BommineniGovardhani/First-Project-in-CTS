/* Given two integer arrays, merge the common elements into a new array. find the sum of the elements 
input1:{1,2,3,4} 
input2:{3,4,5,6} 
logic:{3,4} 
output:7 
*/
import java.util.*;
class Coll1{
public static void main(String args[]){
int[] n1={1,2,3,4};
int[] n2={3,4,5,6};
ArrayList<Integer> list1=new ArrayList<Integer>(n1.length);
for(int i:n1){
list1.add(Integer.valueOf(i));}

ArrayList<Integer> list2=new ArrayList<Integer>();
for(int i:n2){
list2.add(Integer.valueOf(i));}
list1.retainAll(list2);
System.out.println(list1);
int sum=0;
for(int i:list1){
sum=sum+i;}
System.out.println(sum);
}
}