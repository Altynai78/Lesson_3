public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = amount + sum;
        System.out.println("Вы положили деньги на сумму " + sum +" на счет");
    }

    public void withDraw(int sum) throws LimitException{
        if (sum < amount){
            throw new LimitException("Недостаточно средств для снятия суммы", amount);
        }else {
            amount = amount - sum;
            System.out.println("Вы успешно сняли деньги");
        }
    }
}
