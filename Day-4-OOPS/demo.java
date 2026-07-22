//class
class Calculator{

    String Company = "casio";  //instance variable  

//Method
public int add(int n1, int n2) {        //if ,elseif.
        return n1+n2;                                   
    }                                  
    
    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
  }

public class demo{
public static void main(String[] args) {
    Calculator obj=new Calculator();
    
    int a=obj.add(5,8);
    int b=obj.sub(5,9);
    int c=obj.mul(5,10);
    int d=obj.div(5,11);
    System.out.println(obj.Company);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);

    
 }
}