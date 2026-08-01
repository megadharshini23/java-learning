public class SumofArray
{
    public static void main(String[] args)
    {
         int[] marks = {80, 90, 70, 95, 60};
         int i,sum=0;
         
         for(i=0;i<marks.length;i++)
         {
             sum=sum+marks[i];
             
         }
         System.out.println(sum);
    }
}