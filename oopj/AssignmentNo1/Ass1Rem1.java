28/**
    Write a program to convert:
        a. double value into String
        b. double value into Double instance.
        c. String instance into Double instance.
        d. double value into binary, octal and hexadecimal string(Note: Here you can use 
            doubleToLongBits() method along with methods of Long class).
 */

 class Double_Casting{
    public static void main(String a[]){
        double num=111.0987;
        System.out.println("Double value into String (Boxing) : "+ Double.toString(num));
        System.out.println("Double value into Double instance : "+ Double.valueOf(num));
        String str2="112.875";
        System.out.println("String instance into Double instance : "+ Double.valueOf(str2));
        System.out.println("long value into binary : "+Long.toBinaryString(Double.doubleToLongBits(num)));
        System.out.println("long value into hexadecimal : "+Long.toHexString(Double.doubleToLongBits(num)));
        System.out.println("long value into octal : "+Long.toOctalString(Double.doubleToLongBits(num)));
    }
}


29/**
    Write a program to convert state of Double instance into byte, 
short, int, long, float and double.
 */

class Double_Status{
    public static void main(String[] args){
        double a = 12.342;
        Double d = new Double(a);
        //byteValue of the Double Object
        byte bv = d.byteValue();
        // printing the output
        System.out.println("byte value of "+ a + " is : " + bv);

        //shortValue of the Double Object
        short sv = d.shortValue();
        // printing the output
        System.out.println("Short value of "+ a + " is : " + sv);

        // intValue of the Double Object
        int iv = d.intValue();
        // printing the output
        System.out.println("Integer value of "+ a + " is : " + iv);

        // longValue of the Double Object
        long lv = d.longValue();
        // printing the output
        System.out.println("Long value of "+ a + " is  : " + lv);

        // floatValue of the Double Object
        float fv = d.floatValue();
        // printing the output
        System.out.println("Float value of "+ a + " is  : " + fv);

        // doubleValue of the Double Object
        double dv = d.doubleValue();
        // printing the output
        System.out.println("Double value of "+ a + " is : " + dv);
    }
}

30/**
    Write a program to find minimum and maximum number as well as 
to add two double numbers using methods of Double
 */

  class Double_Operations{
    public static void main(String[] a){
        double num1=13.76, num2=23.233;
        System.out.println("Maximum using max class level method : "+Double.max(num1,num2));
        System.out.println("Minimum using min class level method : "+Double.min(num1,num2));
        System.out.println("Addition using sum class level method : "+Double.sum(num1,num2));
    }

}
