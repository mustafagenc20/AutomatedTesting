package be.intecbrussel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorWitOutputTest {
    SomeRepository repository;

/*//    @Test
//    void setupTest(){
//        OutputInterface outputter = new OutputInterface() {
//            @Override
//            public void print(String s) {
//                System.out.println(s);
//            }
//        };
        // or
//        OutputInterface outputter = (s) -> System.out.println(s); // >> leesbaar
        // or
//        OutputInterface outputter = System.out::println;
        // ------------
//        SomeRepository repository = (s) -> s;
        // or
//        SomeRepository repository = (s) -> "Fixed hardcoded return value"; // Interface i degistirdigimiz icin bunu kullanamayiz
        // Do the same thing

                CalculatorWithOutput cwo = new CalculatorWithOutput(
                outputter,
                repository
        );

        */


    @Test
    void setupTest() {
        SomeRepository repository = mock(SomeRepository.class);
        when(repository.save(anyString())).thenReturn("The hardcoded fixed value we want");
        when(repository.isSaved(anyString())).thenReturn(true);

        Assertions.assertNotNull(repository);
        String result = repository.save("A string");
        System.out.println(result);

        System.out.println(repository.isSaved("String"));
        repository.delete("DELETE");
    }
    @BeforeEach
    void init(){
        SomeRepository repository = mock(SomeRepository.class);
        when(repository.save(anyString())).thenReturn(null);

    }

    @Test
    void secondTest() {
        when(repository.save(anyString())).thenReturn(null);
    }
}
