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
public class CatTest {


    @Mock
    Feline feline;
    @Test
    public void checkGetSound() {
        Cat cat = new Cat(feline);
        String actual = "Мяу";
        String expected = cat.getSound();
        assertEquals(expected, actual);
    }

    @Test
    public void checkGetFoodForCat() throws Exception  {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

            List<String> expected = List.of("Животные", "Птицы", "Рыба");
            List<String> actual = cat.getFood();
            Assert.assertEquals(expected, actual);
        }
    }
