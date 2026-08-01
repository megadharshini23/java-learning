public class smallestarray
{
    public static void main (String[] args)
{
   int[] marks = {80, 90, 70, 95, 60};
   int smallest,i;
   smallest=marks[0];
   for(i=1;i<marks.length;i++)
   {
       
       if(marks[i]<smallest)
        smallest=marks[i];
      
   }
   
    System.out.println(smallest);
   
}
}