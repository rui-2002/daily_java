package tutorial;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BasicDataTypesAndWrappersSpikeTest {
    public static void main(String[] args) {
        byte b; // 8 bits

        short s;
        int i; //32 bit
        long l=2;
        float f=3.14f;
        double d;

        char c='A';
        boolean isTrue = true;
        printsize();
        testCreatingofPrimitives();
    }

    public static void printsize(){
        System.out.println();
        System.out.println();
        System.out.println("Size of Primitive Data Types in Java (bits)");
        System.out.println("==============================================");

        System.out.println("Byte "+Byte.SIZE);
        System.out.println("Short "+Short.SIZE);
        System.out.println("Integer "+Integer.SIZE);
        System.out.println("Long "+Long.SIZE);
        System.out.println("Float "+Float.SIZE);
        System.out.println("Double "+Double.SIZE);
        System.out.println("Character "+Character.SIZE);
    }

    public static void testCreatingofPrimitives(){
        boolean isGood=Boolean.parseBoolean("True");
        assertTrue(isGood);
        System.out.println(isGood);

        boolean isVeryVeryGood=Boolean.parseBoolean("TRUE1");
        assertFalse(isVeryVeryGood);
        System.out.println(isVeryVeryGood);

        int number=Integer.parseInt("11");
        assertEquals(11,number);
        System.out.println(number);
    }
}
