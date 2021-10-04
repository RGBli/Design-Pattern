package builder.chain;

public class Client {
    public void buyMilkTea() {
        MilkTea originalMilkTea = new MilkTea.MilkTeaBuilder("original").build();
        showMilkTea(originalMilkTea);

        MilkTea chocolateMilkTea = new MilkTea.MilkTeaBuilder("chocolate")
                                    .ice(true)
                                    .pearl(false)
                                    .size("large").build();
        showMilkTea(chocolateMilkTea);
    }

    public void showMilkTea(MilkTea milkTea) {
        System.out.println(milkTea.toString());
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.buyMilkTea();
    }
}
