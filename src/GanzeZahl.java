public class GanzeZahl extends Zahl<Integer> {
    public GanzeZahl(int wert) {
        super(wert);
    }

    public Zahl<Integer> add(Zahl<Integer> other) {
        return new GanzeZahl(wert + other.wert);
    }

    public Zahl<Integer> subtract(Zahl<Integer> other) {
        return new GanzeZahl(wert - other.wert);
    }
}
