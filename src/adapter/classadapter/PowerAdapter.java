package adapter.classadapter;

import adapter.AC220;
import adapter.DC5;

public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int output5V() {
        int output = output220V();
        return output / 44;
    }
}