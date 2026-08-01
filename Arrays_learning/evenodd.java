public class evenodd {
    
    public static void main (String[] args)
{
   int[] marks = {80, 90, 70, 95, 60};
   int evencount=0,oddcount=0,i;
   
   for(i=0;i<marks.length;i++)
   {
       
       if(marks[i]%2==0)
       evencount=evencount+1;
       else
       oddcount=oddcount+1;
       
   }
   
    System.out.println(evencount);
    System.out.println(oddcount);
   
}
}
    

