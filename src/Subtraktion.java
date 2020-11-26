public class Subtraktion<T> extends BinaerOperation<T> {

    public Subtraktion(Operation<T> operand1, Operation<T> operand2) {
        super(operand1, operand2);
    }

    protected String getOperator() {
        return "-";
    }


    public Zahl<T> getErgebnis() {
        return operand1.getErgebnis().subtract(operand2.getErgebnis());
    }
}
