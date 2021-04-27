package adapter.objectadapter;

import adapter.AC220;
import adapter.DC5;

public class PowerAdapter implements DC5 {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220){
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int output = 0;
        if (ac220 != null) {
            output = ac220.output220V() / 44;
        }
        return output;
    }
}
