public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier, currency);
    }
    String currency() {return currency;}
}
