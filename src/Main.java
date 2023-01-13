public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000.0);

        while (true){
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                try {
                    bankAccount.withDraw((int) e.getRemaniningAmount());
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }
            }break;
        }
    }
}