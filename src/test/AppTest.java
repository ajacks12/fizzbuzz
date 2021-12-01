package test;

import main.App;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AppTest {

    @Test
    void TestFirstFunction(){
        assertEquals(main.App.FirstFunction(1),1);
    }

    @Test
    void TestFizzBuzzConverter(){
        assertEquals(main.App.FizzBuzzConvert(1),"1");
        assertEquals(main.App.FizzBuzzConvert(2),"2");
        assertEquals(main.App.FizzBuzzConvert(3),"Fizz");
        assertEquals(main.App.FizzBuzzConvert(9),"Fizz");
        assertEquals(main.App.FizzBuzzConvert(5),"Buzz");
        assertEquals(main.App.FizzBuzzConvert(10),"Buzz");
        assertEquals(main.App.FizzBuzzConvert(15),"FizzBuzz");
        assertEquals(main.App.FizzBuzzConvert(30),"FizzBuzz");
        assertEquals(main.App.FizzBuzzConvert(16),"16");
        for (int n=1;n<=100;n++){
            System.out.println(n+": " + App.FizzBuzzConvert(n));
        }
    }

}

