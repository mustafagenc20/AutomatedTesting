package be.intecbrussel;

//import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import static org.junit.Assert.*;


// Unit tests --> for classes
// Integration tests
// E2E (End 2 End) tests


public class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    static void static_int(){
        System.out.println("init - before the class");
    }

    @BeforeEach
    void init(){
        System.out.println("init - BeforeEach");
        calculator = new Calculator();
    }

    @Test
    void test(){
        System.out.println("Running test 1");
    }

    @ParameterizedTest
    @ValueSource(strings = {"racecar","asd", "asdfg","asdrw"})
    void palin(String candidate){
        System.out.println(candidate);
    }

    @ParameterizedTest
    @MethodSource("sum_params")
    void param_test(SumParam sumParam){
        int result = calculator.sum(sumParam.a,sumParam.b);
        assertEquals(sumParam.expected, result);
    }

    static Stream<Object> sum_params(){
        return Stream.of(
                new SumParam(1,2,3),
                new SumParam(3,4,6),
                new SumParam(13,2,-3),
                new SumParam(34,4,6),
                new SumParam(1,26,3),
                new SumParam(32,4,67),
                new SumParam(16,2,3),
                new SumParam(33,4,6)
        );
    }

    @Test
    void test2(){
        System.out.println("Running test 2");
    }

    @AfterEach
    void tearDown(){
        System.out.println("After each test");
    }

    @AfterAll
    static void afterClass(){
        System.out.println("Running when all methods done");
    }

    static class SumParam{

        private int a;
        private int b;
        private int expected;
        SumParam(int a, int b, int expected){
            this.a = a;
            this.b = b;
            this.expected = expected;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getExpected() {
            return expected;
        }

        public void setExpected(int expected) {
            this.expected = expected;
        }
    }







//    Calculator calculator;
//    @BeforeClass
//    public static void beforeClass(){
//        System.out.println("Before class method!");
//    }
//
//    @AfterClass
//    public static void afterClass(){
//        System.out.println("After class method!");
//    }
//
//    @Before
//    public void init(){
//        System.out.println("Running init method");
//        calculator = new Calculator();
//    }
//    @After
//    public void tearDown(){
//        System.out.println("Morning After!");
//    }
//    @Test
//    public void sum(){
//        System.out.println("Running test 1");
//        int result = calculator.sum(20,22);
//        // What expected? >> Result == 42
//        // Assert >>
//        Assert.assertEquals(42, result);
//
//        // INPUT >> FUNCTION >> OUTPUT
//    }
//    @Test
//    public void sum_natural_element_test(){
//        System.out.println("Running test 2");
//        int input =10;
//        int result = calculator.sum(input, 0);
//        assertEquals(input, result);
//    }
//    @Test
//    public void sum_with_negative_elements_test(){
//        System.out.println("Running test 3");
//        int inputA = 25;
//        int inputB = -10;
//        int result =calculator.sum(inputA,inputB);
//        assertEquals(15,result);
//    }
//    @Test
//    public void sum_is_commutative(){
//        System.out.println("Running test 4");
//        int inputA = 10;
//        int inputB = 32;
//        int resultA = calculator.sum(inputA,inputB);
//        int resultB = calculator.sum(inputB,inputA);
//        assertEquals(resultA,resultB);
//    }

}