// Enum type with constant-specific method implementations
public enum ConstantSpecificOperation1 {

    PLUS {public double apply(double x, double y){return x + y;}},
    MINUS {public double apply(double x, double y){return x - y;}},
    TIMES {public double apply(double x, double y){return x * y;}},
    DIVIDE{public double apply(double x, double y){return x / y;}};

    public abstract double apply(double x, double y);
}


// Benefits
// 1 - If you add a new constant it is likely that you would add implementation for it else compiler would complain