package be.intecbrussel;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class method!");
    }
    
    @AfterClass
    public static void afterClass(){
        System.out.println("After class method!");
    }

    @Before
    public void init(){
        System.out.println("Running init method");
        calculator = new Calculator();
    }
    @After
    public void tearDown(){
        System.out.println("Morning After!");
    }
    @Test
    public void sum(){
        System.out.println("Running test 1");
        int result = calculator.sum(20,22);
        // What expected? >> Result == 42
        // Assert >>
        Assert.assertEquals(42, result);

        // INPUT >> FUNCTION >> OUTPUT
    }
    @Test
    public void sum_natural_element_test(){
        System.out.println("Running test 2");
        int input =10;
        int result = calculator.sum(input, 0);
        assertEquals(input, result);
    }
    @Test
    public void sum_with_negative_elements_test(){
        System.out.println("Running test 3");
        int inputA = 25;
        int inputB = -10;
        int result =calculator.sum(inputA,inputB);
        assertEquals(15,result);
    }
    @Test
    public void sum_is_commutative(){
        System.out.println("Running test 4");
        int inputA = 10;
        int inputB = 32;
        int resultA = calculator.sum(inputA,inputB);
        int resultB = calculator.sum(inputB,inputA);
        assertEquals(resultA,resultB);
    }

}