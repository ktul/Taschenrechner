public class Taschenrechner {
    void berechne(Operation<?> o) {
        System.out.println(o.getFormel() + " = " + o.getErgebnis());
    }
}
