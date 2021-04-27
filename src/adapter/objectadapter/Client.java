package adapter.objectadapter;

import adapter.AC220;

public class Client {
    private void initObjAdapter() {
        PowerAdapter adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
