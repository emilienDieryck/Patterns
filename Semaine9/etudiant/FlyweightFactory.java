import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String , AbstractFactory> flyweights = new HashMap<>();

    public void put(String key, AbstractFactory value){
        if (!flyweights.containsKey(key)){
            flyweights.put(key, value);
        }
        return;
    }

    public Robot createRobot(String key){
        return flyweights.get(key).createRobot();
    }
}
