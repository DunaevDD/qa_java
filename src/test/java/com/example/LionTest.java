package com.example;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.Collections;



public class LionTest {

    Feline feline = Mockito.mock(Feline.class);

    @Test
    public void checkGetKittensForLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }


    @Test
    public void CheckGetFoodForLion() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(Collections.singletonList("Хищник"));
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }


    @Test(expected = java.lang.Exception.class)
    public void checkExceptionSex() throws Exception {
        Lion lion = new Lion("блабла", feline);
        lion.doesHaveMane();
    }
}


