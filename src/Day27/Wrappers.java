package Day27;

public class Wrappers {
    public static void main(String[] args) {

        // Convert String to Integer
        Integer integer2 = Integer.parseInt("55");
        Integer integer3 = Integer.valueOf("222");

        // integer4 and integer5 share the same reference
        Integer integer4 = 55; // autoboxing, auto conversion
        Integer integer5 = 55; // autoboxing
        Double double1 = 22.0; // autoboxing

        // Implicit casting
        int intN = 500;
        long longN = intN;

        // Explicit casting
        long long2 = 222;
        int int2 = (int)long2;

        String intNumber = "19932";
        int primitiveInt = Integer.parseInt(intNumber);

        String doubleNumber = "25.55";
        double primitiveDouble = Double.parseDouble(doubleNumber);

        String booleanValue = "false";
        boolean primitiveBoolean = Boolean.parseBoolean(booleanValue);

        String intWrap = "1343";
        // String -> int -> Integer
        Integer integer1 = Integer.parseInt(intWrap);
        // String -> Integer
        Integer integer6 = Integer.valueOf(intWrap);

        String shortWrap="354";
        Short short1 = Short.valueOf(shortWrap);

        Integer integer = 234;
        String string1 = String.valueOf(integer);

        Integer integer9 = 234;
        int intPrimitive = integer9; // auto-unboxing
        int intPrimitive2 = integer9.intValue(); // unboxing

        Boolean booleanWrapper = true; // autoboxing
        String string2 = String.valueOf(booleanWrapper);

        Boolean booleanWrapper2 = true; // autoboxing
        boolean booleanPrimitive = booleanWrapper2; // auto-unboxing

        Double doubleWrapper = 22.2; // autoboxing
        String string3 = String.valueOf(doubleWrapper); // unboxing

        Double doubleWrapper2 = 266.44;
        double doublePrimitive = doubleWrapper2;



    }
}
