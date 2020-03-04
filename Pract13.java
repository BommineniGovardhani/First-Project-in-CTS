public class Pract13 {
      public static void main(String[] args) {
            int[] a = {2,3,4,1,2,3,4};
           // int[] a = {1,2,3};
            System.out.println(sequenceInArray(a));
      }
      public static boolean sequenceInArray(int[] a) {
            boolean b = false;
            int n = 0;
            for(int i = 0;i < a.length-1;i++)
                  if((a[i+1]-a[i]) == 1)
                        n++;
                  if(n == 2)
                        b = true;
            return b;
      }
}//1 2 3 4 7 8