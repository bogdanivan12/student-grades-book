public class Operation implements Minus, Plus, Mult, Div {
    private Float x;

    @Override
    public String toString() {
        return x.toString();
    }

    public Operation() {
        this.x = 0f;
    }
    public Operation(float x) {
        this.x = x;
    }
    @Override
    public void div(float x) {
        this.x /= x;
    }

    @Override
    public void minus(float x) {
        this.x -= x;
    }

    @Override
    public void mult(float x) {
        this.x *= x;
    }

    @Override
    public void plus(float x) {
        this.x += x;
    }
}
