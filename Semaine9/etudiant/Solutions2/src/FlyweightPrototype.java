import java.util.HashMap;
import java.util.Map;

public class FlyweightPrototype {

    private Map<String , Robot> flyweights = new HashMap<>();

    public void put(String key, Robot value){
        if (!flyweights.containsKey(key)){
            flyweights.put(key, value);
        }
        return;
    }

    public Robot createRobot(String key){
        return flyweights.get(key).clone();
    }
}
