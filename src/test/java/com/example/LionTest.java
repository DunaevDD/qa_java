package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.Collections;


@RunWith(Parameterized.class)
public class LionTest {

    Feline feline = Mockito.mock(Feline.class);
    @Test
    public void checkGetKittensForLion() {
        Lion lion = new Lion(feline);
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

        private final String actual;
        private final boolean expected;

        public LionTest(String actual, boolean expected) {
            this.actual=actual;
            this.expected=expected;
        }
    @Parameterized.Parameters
    public static Object[][] paramTest() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Трап", true},
        };
    }
    @Test
    public void checkDoesHaveMane() {
        //

        try {    Lion lion = new Lion(actual);
            boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expected,actual );
        } catch(java.lang.Exception exception) {
            System.out.println("обрабатываемое исключение");
        }
    }
    @Test
    public void CheckGetFoodForLion() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(Collections.singletonList("Хищник"));
        Lion lion = new Lion(feline);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
}
