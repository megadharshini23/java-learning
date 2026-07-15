public class TypeConversion {

    public static void main(String[] args) {

        byte b = 100;

        int i = b;          // Automatic conversion
        long l = i;         // Automatic conversion
        float f = l;        // Automatic conversion
        double d = f;       // Automatic conversion

        System.out.println("Byte   : " + b);
        System.out.println("Int    : " + i);
        System.out.println("Long   : " + l);
        System.out.println("Float  : " + f);
        System.out.println("Double : " + d);

    }
}