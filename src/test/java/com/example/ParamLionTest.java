package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;


import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParamLionTest {
    @Mock
    Feline feline;

    private final String sex;
    private final boolean expected;

    public ParamLionTest(String sex, boolean expected) {
        this.sex=sex;
        this.expected=expected;
    }

    @Parameterized.Parameters()
    public static Object[][] paramTest() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);

        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

}