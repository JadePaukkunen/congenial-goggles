package fi.academy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

//    List<String> luokka = new ArrayList<>();

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        for (int i=1; i<=100; i++){
            System.out.println(fb.fizzbuzz(i));
        }
    }
    public String fizzbuzz (int luku){
            if (luku == 0){
                return "awwhellno";
            }
            if (luku % 3 == 0 && luku % 5 == 0) {
                return "fizzbuzz";
            }
            if (luku % 3 == 0 ) {
                return "fizz";
            }

            if (luku % 5 == 0 ) {
                return "buzz";
            }else {
                return "" + luku;
            }

    }
}
