public class ReeleZahl extends Zahl<Double> {
    public ReeleZahl(double wert) {
        super(wert);
    }

    public Zahl<Double> add(Zahl<Double> other) {
        return new ReeleZahl(wert + other.wert);
    }

    public Zahl<Double> subtract(Zahl<Double> other) {
        return new ReeleZahl(wert - other.wert);
    }
}
