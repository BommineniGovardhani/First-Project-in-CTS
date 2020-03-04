import java.util.*; 
  
class Set 
{ 
    public static void main(String[]args) 
    { 
        HashSet h = new HashSet(); 
  
        // Adding elements into HashSet usind add() 
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        h.add("India");// adding duplicate elements 
  
        // Displaying the HashSet 
        System.out.println(h); 
    }
}