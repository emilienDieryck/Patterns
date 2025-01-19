package strategy;

import interfaces.Strategy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ListDeMots {

    private String arg;

    public ListDeMots(String arg) {
        this.arg = arg;
    }

    public void imprimeSi(Strategy strategy) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(this.arg));
        String buffer = null;
        while ((buffer = input.readLine()) != null) {
            StringTokenizer mots = new StringTokenizer(buffer, " \t.;(){}\"'*=:!/\\");
            while (mots.hasMoreTokens()) {
                String mot = mots.nextToken();
                if (strategy.estValide(mot)) {
                    System.out.println(mot);
                }

            }
        }
    }


}
