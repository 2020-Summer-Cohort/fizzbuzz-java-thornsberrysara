package org.wecancodeit.fizzbuzz;

public class FizzBuzz {

        public String translate(int numberToTranslate) {

            if (numberToTranslate % 15 == 0) return "FizzBuzz";
            else if (numberToTranslate % 3 == 0) return "Fizz";
            else if (numberToTranslate % 5 == 0) return "Buzz";
            else return "" + numberToTranslate;
        }
    }
