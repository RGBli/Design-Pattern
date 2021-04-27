package flyweight;

import java.util.HashMap;

public class FlyWeightFactory {
    private HashMap<String, FlyWeight> flyWeights = new HashMap<>();

    public FlyWeight getFlyWeight(String key) {
        FlyWeight flyWeight = flyWeights.get(key);
        if (flyWeight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyWeight = new ConcreteFlyWeight(key);
            flyWeights.put(key, flyWeight);
        }
        return flyWeight;
    }
}
