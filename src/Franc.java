public class Franc extends Money{
    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier, currency);
    }
    String currency() {return currency;}
}
