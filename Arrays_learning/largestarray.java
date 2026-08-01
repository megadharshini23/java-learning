public class largestarray {
    
    
    public static void main (String[] args)
{
   int[] marks = {80, 90, 70, 95, 60};
   int largest,i;
   largest=marks[0];
   for(i=1;i<marks.length;i++)
   {
       
       if(marks[i]>largest)
        largest=marks[i];
      
   }
   
    System.out.println(largest);
   
}
}


