public abstract class BinaerOperation<T> implements Operation<T> {
    protected Operation<T> operand1;
    protected Operation<T> operand2;

    public BinaerOperation(Operation<T> operand1, Operation<T> operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    protected abstract String getOperator();

    public String getFormel() {
        String operator = getOperator();
        return "(" + operand1.getFormel() + " " + operator + " " + operand2.getFormel() + ")";
    }

}
