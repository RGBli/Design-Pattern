package adapter.classadapter;

import adapter.DC5;

public class Client {
    public void initClassAdapter() {
        DC5 dc5 = new PowerAdapter();
        dc5.output5V();
    }
}
