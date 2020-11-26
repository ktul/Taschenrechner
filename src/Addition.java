public class Addition<T> extends BinaerOperation<T> {

    public Addition(Operation<T> operand1, Operation<T> operand2) {
        super(operand1, operand2);
    }

    protected String getOperator() {
        return "+";
    }

    public Zahl<T> getErgebnis() {
        return operand1.getErgebnis().add(operand2.getErgebnis());
    }
}