
public class ElseIfLadder 
{
    public static void main(String[] args) 
    {
        int x=5;
        int y=6;
        int z=7;
        //using Relational(>) and logical operator(&&)
        if(x>y && x>z)
        {
            System.out.print("x is larger");
        }
        else if(y>z)
        {
            System.out.print("y is larger");
        }
        else
        {
            System.out.print("z is larger");
        }
        
    }
}
