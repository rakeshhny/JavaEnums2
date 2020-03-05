import java.util.EnumSet;
import java.util.Set;
import java.util.stream.Stream;

public class CommandUsingEnumSet {

    public enum HINTS {
        DATA_HOLDINGS, DATA_NO_INVESTMENTS, DATA_FIND_HOLDING_NAMES, DATA_USES_MULTI_ROW_HEADERS;
    }

    public static void main(String[] args) {
        Stream.of(HINTS.values()).forEach(System.out::println);
/*
        applyHints(EnumSet.of(HINTS.DATA_HOLDINGS ,HINTS.DATA_NO_INVESTMENTS));
        applyHints(EnumSet.of(HINTS.DATA_HOLDINGS ,HINTS.DATA_FIND_HOLDING_NAMES));
        applyHints(EnumSet.of(HINTS.DATA_HOLDINGS ,HINTS.DATA_USES_MULTI_ROW_HEADERS));
*/

/*
        parseData("data", EnumSet.of(HINTS.DATA_HOLDINGS, HINTS.DATA_FIND_HOLDING_NAMES));
        parseData("data", EnumSet.of(HINTS.DATA_FIND_HOLDING_NAMES, HINTS.DATA_USES_MULTI_ROW_HEADERS));
*/

    }

    public static void applyHints(Set<HINTS> hints) {
        System.out.println(hintsAreHoldingAndNoInvestment(hints));
    }

    public static boolean hintsAreHoldingAndNoInvestment(Set<HINTS> hints) {
        if ( hints.size() != 2) {
            return false;
        }

        long hints_count = hints.stream().filter(e -> (e == HINTS.DATA_HOLDINGS || e == HINTS.DATA_NO_INVESTMENTS)).count();
        return hints_count == 2;
    }

    public static void parseData(String data, Set<HINTS> hints) {
        for ( HINTS hint : hints ) {
            switch(hint) {
                case DATA_HOLDINGS:
                    System.out.println("Processing holdings");
                    break;
                case DATA_FIND_HOLDING_NAMES:
                    System.out.println("We have to find holding names");
                    break;
                case DATA_USES_MULTI_ROW_HEADERS:
                    System.out.println("We have to use multi row headers.");
                    break;
            }
        }
    }
}
