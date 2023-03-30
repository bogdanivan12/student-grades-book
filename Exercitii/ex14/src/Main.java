public class Main {
    public static void main(String[] args) {
        Operation op = new Operation(5);
        op.div(3);
        op.mult(6);
        op.minus(2);
        op.plus(3);
        System.out.println(op.toString());
    }
}