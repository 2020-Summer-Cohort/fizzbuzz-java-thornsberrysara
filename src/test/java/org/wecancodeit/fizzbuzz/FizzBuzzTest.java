package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fb = new FizzBuzz();

    @Test
    public void returnsNumberIfNotMultiple() {
        String output = fb.translate(1);
        assertEquals("1", output);
    }

    @Test
    public void returnsFizzIfMultipleOf3() {
        String output = fb.translate(3);
        assertEquals("Fizz", output);
    }

    @Test
    public void returnsBuzzIfMultipleOf5() {
        String output = fb.translate(5);
        assertEquals("Buzz", output);
    }

    @Test
    public void returnsFizzBuzzIfMultipleOf3And5() {
        String output = fb.translate(15);
        assertEquals("FizzBuzz", output);
    }
}