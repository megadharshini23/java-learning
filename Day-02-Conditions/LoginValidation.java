public class LoginValidation {
    public static void main(String[] args) {
        String name="mega";
        int password=2007;
        
        String orginal="cloud";
        int orginalpass=2004;

        if(name==orginal && password==orginalpass)
        {
            System.out.println("login sucess");
        }
        else{
            System.err.println("login fail");
        }


    }
}
