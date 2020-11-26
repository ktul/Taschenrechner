public class Main {
    public static void main(String[] args) {
        Taschenrechner t = new Taschenrechner();
        t.berechne(new Addition<>(new GanzeZahl(3), new GanzeZahl(4)));
        t.berechne(new Addition<>(new GanzeZahl(7), new GanzeZahl(5)));
        t.berechne(new Subtraktion<>(new GanzeZahl(7), new GanzeZahl(5)));
        // (3 + 4) - (2 - 4) = 9
        t.berechne(new Subtraktion<>(
                new Addition<>(new GanzeZahl(3), new GanzeZahl(4)),
                new Subtraktion<>(new GanzeZahl(2), new GanzeZahl(4))
        ));
        // (3 + 4) + (2 - 4) = 9
        t.berechne(new Addition<>(
                new Addition<>(new GanzeZahl(3), new GanzeZahl(4)),
                new Subtraktion<>(new GanzeZahl(2), new GanzeZahl(4))
        ));

        t.berechne(new Addition<>(new GanzeZahl(3), new GanzeZahl(4)));
        t.berechne(new GanzeZahl(3).add(new GanzeZahl(4)));


        t.berechne(new Addition<>(new ReeleZahl(3), new ReeleZahl(4)));
//        t.berechne(new Addition<Number>(new GanzeZahl(3), new ReeleZahl(4)));
    }
}
