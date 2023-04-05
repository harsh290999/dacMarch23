21/**
    Write a program to convert state of Long instance into byte, 
short, int, long, float and double.

 */

 class Long_Status{
    public static void main(String[] args){
        long a = 122;
        Long l = new Long(a);
        //byteValue of the Long Object
        byte bv = l.byteValue();
        // printing the output
        System.out.println("byte value of "+ a + " is : " + bv);

        //shortValue of the Long Object
        short sv = l.shortValue();
        // printing the output
        System.out.println("Short value of "+ a + " is : " + sv);

        // intValue of the Long Object
        int iv = l.intValue();
        // printing the output
        System.out.println("Integer value of "+ a + " is : " + iv);

        // longValue of the Long Object
        long lv = l.longValue();
        // printing the output
        System.out.println("Long value of "+ a + " is  : " + lv);

        // floatValue of the Long Object
        float fv = l.floatValue();
        // printing the output
        System.out.println("Float value of "+ a + " is  : " + fv);

        // doubleValue of the Long Object
        double dv = l.doubleValue();
        // printing the output
        System.out.println("Double value of "+ a + " is : " + dv);
    }
}


22/**
    Write a program to find minimum and maximum number as well as 
to add two long numbers using methods of Long.
 */
class Long_Operations{
    public static void main(String[] a){
        long num1=1376, num2=23233;
        System.out.println("Maximum using max class level method : "+Long.max(num1,num2));
        System.out.println("Minimum using min class level method : "+Long.min(num1,num2));
        System.out.println("Addition using sum class level method : "+Long.sum(num1,num2));
    }

}

23/**
    Write a program to perform below operations on float type to 
get: 
a. The number of bits used to represent a float value
b. The number of bytes used to represent a float value
c. The minimum value a float
d. The maximum value a float

 */

class Float_Type{
    public static void main(String a[]){
        System.out.println("The number of bits used to represent a float value    :: "+Float.SIZE);
        System.out.println("The number of bytes used to represent a float value   :: "+Float.BYTES);
        System.out.println("The minimum value a float                             ::"+(float)Float.MIN_VALUE);
        System.out.println("The maximum value a float                             :: "+(float)Float.MAX_VALUE);
    }
}

24/**
    .Write a program to convert:
        a. float value into String
        b. float value into Float instance.
        c. String instance into Float instance.
        d. float value into hexadecimal string.

 */

class Float_Casting{
    public static void main(String a[]){
        float num=10.3f;
        System.out.println("Float value into String (Boxing) : "+ Float.toString(num));
        System.out.println("Float value into Float instance : "+ Float.valueOf(num));
        String str2="11.8f";
        System.out.println("String instance into Float instance : "+ Float.valueOf(str2));
        System.out.println("Float value into hexadecimal : "+Float.toHexString(num));

    }
}

25/**
    Write a program to convert state of Float instance into byte, 
short, int, long, float and double.

 */

class Float_Status{
    public static void main(String[] args){
        float a = 122;
        Float f = new Float(a);
        //byteValue of the Float Object
        byte bv = f.byteValue();
        // printing the output
        System.out.println("byte value of "+ a + " is : " + bv);

        //shortValue of the Float Object
        short sv = f.shortValue();
        // printing the output
        System.out.println("Short value of "+ a + " is : " + sv);

        // intValue of the Float Object
        int iv = f.intValue();
        // printing the output
        System.out.println("Integer value of "+ a + " is : " + iv);

        // longValue of the Float Object
        long lv = f.longValue();
        // printing the output
        System.out.println("Long value of "+ a + " is  : " + lv);

        // floatValue of the Float Object
        float fv = f.floatValue();
        // printing the output
        System.out.println("Float value of "+ a + " is  : " + fv);

        // doubleValue of the Float Object
        double dv = f.doubleValue();
        // printing the output
        System.out.println("Double value of "+ a + " is : " + dv);
    }
}

26/**
    Write a program to find minimum and maximum number as well as 
to add two float numbers using methods of Float.
 */

 class Float_Operations{
    public static void main(String[] a){
        float num1=13.76f, num2=23.233f;
        System.out.println("Maximum using max class level method : "+Float.max(num1,num2));
        System.out.println("Minimum using min class level method : "+Float.min(num1,num2));
        System.out.println("Addition using sum class level method : "+Float.sum(num1,num2));
    }

}
27/**
    Write a program to perform below operations on Double type to 
get: 
a. The number of bits used to represent a double value
b. The number of bytes used to represent a double value
c. The minimum value a double
d. The maximum value a double
 */

 class Double_Type{
    public static void main(String a[]){
        System.out.println("The number of bits used to represent a integer value    :: "+Double.SIZE);
        System.out.println("The number of bytes used to represent a integer value   :: "+Double.BYTES);
        System.out.println("The minimum value a integer                             ::"+(double)Double.MIN_VALUE);
        System.out.println("The maximum value a integer                             :: "+(double)Double.MAX_VALUE);
    }
}
