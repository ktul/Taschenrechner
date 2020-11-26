public abstract class Zahl<T> implements Operation<T> {
    protected T wert;

    public Zahl(T wert) {
        this.wert = wert;
    }

    public String getFormel() {
        return "" + wert;
    }

    public Zahl<T> getErgebnis() {
        return this;
    }

    public String toString() {
        return getFormel();
    }

    public abstract Zahl<T> add(Zahl<T> other);

    public abstract Zahl<T> subtract(Zahl<T> other);
}
