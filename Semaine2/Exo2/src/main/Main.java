package main;
import strategy.*;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        ListDeMots listDeMots = new ListDeMots("src/test.txt");



        try {
            System.out.println("starts with 't' \n");
            listDeMots.imprimeSi(new StrategyStartWith("t"));
            System.out.println("Length");
            listDeMots.imprimeSi(new StrategyLength(4));
            System.out.println("Palindrome\n");
            listDeMots.imprimeSi(new StrategyPalindromes());
            System.out.println("And");
            listDeMots.imprimeSi(new And(new StrategyStartWith("t"), new StrategyLength(3)));
            System.out.println("Or");
            listDeMots.imprimeSi(new Or(new StrategyStartWith("t"), new StrategyLength(3)));
            System.out.println("Not");
            listDeMots.imprimeSi(new Not(new StrategyStartWith("t")));
            System.out.println("Et");
            listDeMots.imprimeSi(new Et(new StrategyStartWith("t"), new StrategyLength(4) , new StrategyPalindromes()));
            System.out.println("Ou");
            listDeMots.imprimeSi(new Et(new StrategyStartWith("t"), new StrategyLength(4) , new StrategyPalindromes()));
            System.out.println("Compteur");
            listDeMots.imprimeSi(new Compteur(new StrategyPalindromes()));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}