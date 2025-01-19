package strategy;

import interfaces.Strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ou implements Strategy {

    List<Strategy> arraylist;

    public Ou(Strategy... arraylist) {
        this.arraylist = new ArrayList<>();

        this.arraylist.addAll(Arrays.stream(arraylist).toList());
    }

    @Override
    public boolean estValide(String mot) {
        boolean or = false;

        for (Strategy strategy : arraylist){
            if(strategy.estValide(mot)) {
                or = true;
            }
        }
        return or;
    }
}
