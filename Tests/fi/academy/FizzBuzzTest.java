package fi.academy;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fb;
    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzz();
    }

    @Test
    public void onkolukujaollinenkolmella() {
        assertEquals("fizz", fb.fizzbuzz(3));
    }

    @Test
    public void onkolukujaollinenviidella() {
        assertEquals("buzz", fb.fizzbuzz(5));

    }

    @Test
    public void onkolukujaollinenviidellajakolmella() {
        assertEquals("fizzbuzz", fb.fizzbuzz(15));
        assertEquals("fizzbuzz", fb.fizzbuzz(30));
    }

    @Test
    public void palauttaakosamanluvun() {
        assertEquals("1", fb.fizzbuzz(1));
        assertEquals("2", fb.fizzbuzz(2));
        assertEquals("4", fb.fizzbuzz(4));
    }
    @Test
    public void onkolukujaollinennollalla() {
        assertEquals("awwhellno", fb.fizzbuzz(0));
    }

//    @Test
//    public void jaollinenjasisaltaa(){
//        assertEquals("fizz", fb.fizzbuzz(13));// A number is fizz if it is divisible by 3 or if it has a 3 in it
//        assertEquals("buzz", fb.fizzbuzz(54));// A number is buzz if it is divisible by 5 or if it has a 5 in it
//    }


}