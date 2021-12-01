package main;

public class App {
    public static int FirstFunction(int i) {
        return 1;
    }

    public static String FizzBuzzConvert(int i) {
        String fz = "Fizz";
        String bz = "Buzz";
        int num1 = 3;
        int num2 = 5;

        if (i%num1==0 && i%num2==0){
            return fz+bz;
        }
        if (i%num1==0){
            return fz;
        }
        if (i%num2==0){
            return bz;
        }
        return String.valueOf(i);
    }
}
