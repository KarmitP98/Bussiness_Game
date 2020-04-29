import java.util.HashMap;
import java.util.Map;

public class Main {

    private HashMap<String, Float> budget;
    private float money, expCap, expense, salary, saving;
    private boolean expCapSet, expCapExceeded;

    public Main() {
        money = 0;
        budget = new HashMap<>();
        expCap = 0;
        expCapSet = false;
        expCapExceeded = false;
        expense = 0;
        salary = 0;
        saving = 0;
    }

    public void setExpCap(float cap) {
        this.expCap = cap;
        expCapSet = true;
    }

    public void addExpense(String name, float amount) {
        if (expCapSet) {
            budget.put(name, amount);
            money -= amount;
            expense += amount;

            updateBudget();
        }
    }

    public void addSavings(float amount) {
        if (expCapSet) {
            budget.put("Default Savings", amount);
            money += amount;
            saving += amount;
            updateBudget();
        }
    }

    public void addSalary(float amount) {
        if (expCapSet) {
            budget.put("Salary", amount);
            money += amount;
            salary += amount;
            updateBudget();
        }
    }

    private void updateBudget() {
        System.out.printf("This Month's Budget is $%.2f.", money);
        nl();
    }

    public void showBudget() {
        nl();
        nl();
        System.out.println("*****BUDGET*****");
        for (Map.Entry e : budget.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    private void nl() {
        System.out.println();
    }

    public static void main(String[] args) {

        Main m = new Main();
        m.setExpCap(1000);
        m.addSalary(1500);
        m.addExpense("Walmart", 362F);
        m.addExpense("Canadian Tire", 433.08F);
        m.addExpense("President's Choice", 342.98F);

        m.showBudget();

    }
}
