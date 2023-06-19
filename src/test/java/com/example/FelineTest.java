package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;
public class FelineTest {

    @Test
        public void checkEatMeatForFeline() throws Exception {
            Feline feline = new Feline();

            List<String> expected = List.of("Животные", "Птицы", "Рыба");
            List<String> actual = feline.eatMeat();
            Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkGetFamilyForFeline() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
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