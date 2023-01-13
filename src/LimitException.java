public class LimitException extends Exception {


    private double remaniningAmount;

    public LimitException(String message, double remaniningAmount) {
        super(message);
        this.remaniningAmount = remaniningAmount;
    }

    public double getRemaniningAmount() {
        return remaniningAmount;

    }
}



