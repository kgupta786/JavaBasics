public class JavaTypes {

    public void process(){

        System.out.println("***************Defining the integers**********");
        /**
         *  Value of the corresponding type ranges from -2^(n-1) till 2^(n-1)-1
         *
         */
        byte b1 = 10; // 1 byte
        short s1 = 12; // 2 bytes
        int val1 = 128; // 4 bytes
        long l1 = 12345; // 8 bytes

        System.out.println("byte value is " + b1);
        System.out.println("short value is " + s1);
        System.out.println("int value is " + val1);
        System.out.println("long value is " + l1);


        System.out.println("***********Defining the decimals*************");
        float f1 = 1.0f; // without 'f' keyword this shows error because by default value is of double type
        double d1 = 2.9;

        System.out.println("Float value is " + f1);
        System.out.println("Double value is " + d1);

        System.out.println("*****************Defining the Booleans*************");
        boolean bl = false; // 1 bit either 0 or 1
        System.out.println("boolean value is " + bl);


        System.out.println("*************Defining Characters and Strings*********");

        char c1 = 'x'; // 2 bytes
        System.out.println("Character value is " + c1);

        //Strings are not primitive data types but in java they act as one

        String s = "helloWorld";
        System.out.println("String value is " + s);

    }
}
