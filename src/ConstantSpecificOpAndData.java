import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum ConstantSpecificOpAndData {
    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    ConstantSpecificOpAndData(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public abstract double apply(double x, double y);

    public static final Map<String, ConstantSpecificOpAndData> stringToEnum =
            Stream.of(values()).collect(Collectors.toMap(Object::toString, e -> e));

    public static Optional<ConstantSpecificOpAndData> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }
}

// Benefits
// 1 - Allows constant specific data
// 2 - Since there is a toString(...) method you can write a reverse lookup to find the name of the enum based upon string
