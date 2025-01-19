package strategy;

import interfaces.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Et implements Strategy {

    private List<Strategy> list;

    public Et(Strategy... strategies) {
        this.list = new ArrayList<>();

        list.addAll(List.of(strategies));
    }

    @Override
    public boolean estValide(String mot) {
        for (Strategy strategy : list) {
            if (!strategy.estValide(mot)) return false;
        }
        return true;
    }
}
