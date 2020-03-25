package com.step.demo.wrapper;

/**
 *
 * @author sscerbatiuc
 */
public class WrappersDemo {
    
    public static void test(int a){
        System.out.println(a);
    }
    
    public static void testAutoboxing(Integer a){
        System.out.println("autoboxed:" + a);
    }

    public static void main(String[] args) {
        int x = 100;
        test(x);
        // unboxing
        Integer num = 10000;
        test(num);
        
        testAutoboxing(x);
        
        Integer y; // null
        Integer num2 = new Integer(150);
        int num5 = Integer.parseInt("1500");
        
        Integer num4 = Integer.valueOf("120");
        Integer.compare(1, 2);
        Integer.min(12, 24);
        
        boolean isEnabled = Boolean.parseBoolean("1231234234234234");
        
        String x1 = "Hello";
        String x2 = "Hello";
        
        // Integer. da acces la un numar mare de metode statice
        // .compare() returneaza: < -1; = 0; > 1;
        int comparison = Integer.compare(100, num);
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(num);
        System.out.println(numberOfTrailingZeros);
        
        // Metode comode din Character
        char c2 = 'c';
        Character c = 'c';
        
        Character.isLowerCase('a');
        Character.isLetter('a');
        Character.isDigit('a');
        Character.isAlphabetic('a');
        Character.isUpperCase('a');
        Character.isWhitespace('a');
        
        // Conversia din String in wrapper
        Integer.parseInt("12");
        Double.parseDouble("12.45");
        Boolean.parseBoolean("true");
        
        
    }
}
