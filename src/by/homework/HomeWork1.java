package by.homework;

public class HomeWork1 {
    public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 23;
        int b = 30;
        int c = a + b;
        if ( c >= 0 ){
            System.out.println( "Positive summ" ); // при выводе строки на русском языке к консоли отображаются "?"
            System.out.println( "Negative summ" );
        }
    }
    public static void printColor(){
        int value = 196;
        if (value <= 0) {
            System.out.println( "Red" );
        }
        if (value > 0 && value <= 100) {
            System.out.println( "Yellow" );
        }
        if (value > 100) {
            System.out.println( "Green" );
        }

    }
    public static void compareNumbers(){
        int a = -2303;
        int b = 3009;
        if (a >= b ) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
