package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    Animal animal;

    @Test
        public void checkEatMeatForFeline() throws Exception {
            Feline feline = new Feline();
            Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            feline.eatMeat();
            List<String> expected = List.of("Животные", "Птицы", "Рыба");
            List<String> actual = feline.eatMeat();
            Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkGetFamilyForFeline() {
        Feline feline = new Feline();
        String actual = "Кошачьи";
        String expected = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void CheckGetKittensWithoutParameters() {
        Feline feline = new Feline();
        int actual = feline.getKittens(1);
        int expected = feline.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void CheckGetKittensWithParameters() {
        Feline feline = new Feline();
        int actual = 1;
        int expected = feline.getKittens(1);
        assertEquals(expected, actual);
    }
}