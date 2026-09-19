class Lecture2 {
    public static void main (String [] args) {
        // int num1 = 4;
        // System.out .println(num1);

        // program 2 wideningconversion
        //int num1 = 10;
        //double num2 = (double) num1; // converting narrower(smaller) data type to wide data type is called the widening
        // double num3 = num1; // this also works because explicit typecasting is optional 
        // System.out.println("printing the num2 =" + num2);
        // System.out.println("printing the num3 =" + num3);


        // program3 Narrowing conversion
        // double num1 = 10.5;
        // int num2 = (int)num1; // will work
        // int num3 = num1; // will not work as narrowing conversion is mandatory
        // System.out.println("printing the num2 =" + num2);
        // System.out.println("printing the num3 =" + num3);

        // primitive to non primitive conversion is called Boxing
        // int is primitve type
        int num1 = 10;

        // string is non- primitve type
        // String num2 = Integer.toString(num1);
        String num2 = String.valueOf(num1);

        System.out.println(num2); 

         // unboxing converting non primitive to primitive type
        String num3 = "10";

        int num4 = Integer.parseInt(num3);

        System.out.println(num4);
    }
}