// Enum type that switches on its own value - questionable
public enum Operation {
    PLUS, MINUS, TIMES, DIVIDE;
    // Do the arithmetic operation represented by this constant
    public double apply(double x, double y) {
        switch(this) {
            case PLUS: return x + y;
            case MINUS: return x - y;
            case TIMES: return x * y;
            case DIVIDE: return x / y;
        }
        throw new AssertionError("Unknown op: " + this);
    }
}












// Problems with this code
// 1 - It won't compile w/out the throw statement
// 2 - It's fragile because even if you add a new operation and forgot to add
// an implementation for it, the code would still compile
// 3 - Finding errors at run time is too late, can we get any support from compiler instead