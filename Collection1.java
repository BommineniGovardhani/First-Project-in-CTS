/*.Create a class with a method which can remove all the elements from a list other than the collection of elements specified. Class Name :ListManager Method Name: removeElements
 Method Description : Remove all the elements from a list other than the collection of elements specified. Argument: List<String> list1, List<String> list2; Return Type : List- ArrayList contains the resulting List after the removal process. Logic : Accept two List objects list1 and list2 and remove all the elements from list 1 other than the elements contained in list2. This should be done in single step process without using loop
*/
import java.util.ArrayList; 
 public class Collection1 {
public static void main(String[] args) 
 {
ArrayList<String> list1 = new ArrayList<String>(); 
          list1.add("A"); 
        list1.add("B"); 
        list1.add("C"); 
        list1.add("D");
        ArrayList<String> list2 = new ArrayList<String>(); 
        list2.add("A"); 
        list2.add("B"); 
        list2.add("C"); 
  removeElements(list1,list2);
System.out.println( list1); 
}
public static ArrayList<String> removeElements(ArrayList<String> list1,ArrayList<String> list2){
        list1.retainAll(list2); 
return list1;
 //list1.removeAll(list2);
  
     
        
    } 
} 