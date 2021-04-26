package builder;

public class User {
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
}
