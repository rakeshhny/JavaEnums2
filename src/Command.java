// 1 ==> 0001 << 0 ==> 0001 ==> 1
// 1 ==> 0001 << 1 ==> 0010 ==> 2
// 1 ==> 0001 << 2 ==> 0100 ==> 4
// 1 ==> 0001 << 3 ==> 1000 ==> 8

public class Command {
    public static final int DATA_HOLDINGS = (1 << 0);
    public static final int DATA_NO_INVESTMENTS = (1 << 1);
    public static final int DATA_FIND_HOLDING_NAMES = (1 << 2);
    public static final int DATA_USES_MULTI_ROW_HEADERS = (1 << 3);

    public static void main(String[] args) {
        System.out.println("DATA_HOLDINGS = " + DATA_HOLDINGS);
        System.out.println("DATA_NO_INVESTMENTS = " + DATA_NO_INVESTMENTS);
        System.out.println("DATA_FIND_HOLDING_NAMES = " + DATA_FIND_HOLDING_NAMES);
        System.out.println("DATA_USES_MULTI_ROW_HEADERS = " + DATA_USES_MULTI_ROW_HEADERS);


/*
        applyHints(DATA_HOLDINGS | DATA_NO_INVESTMENTS);
        //0001
        //0010
        //-----
        //0011

        applyHints(DATA_HOLDINGS | DATA_FIND_HOLDING_NAMES);
        applyHints(DATA_HOLDINGS | DATA_USES_MULTI_ROW_HEADERS);

 */

/*        System.out.println("Parsing data 1");
        parseData("data", DATA_HOLDINGS | DATA_FIND_HOLDING_NAMES);

        System.out.println("Parsing data 2");
        parseData("data", DATA_FIND_HOLDING_NAMES | DATA_USES_MULTI_ROW_HEADERS);

 */
    }

    public static void applyHints(int hints) {
        System.out.println(hintsAreHoldingAndNoInvestment(hints));
    }

    public static boolean hintsAreHoldingAndNoInvestment(int hint_number) {
        if ((hint_number == (DATA_HOLDINGS | hint_number)) && (hint_number == (DATA_NO_INVESTMENTS | hint_number))) {
            return true;
        }
        return false;
    }

    public static void parseData(String data, int hint_number) {
        if (hint_number == (DATA_HOLDINGS | hint_number)) {
            System.out.println("Processing holdings");
        }
        if (hint_number == (DATA_FIND_HOLDING_NAMES | hint_number)) {
            System.out.println("We have to find holding names");
        }
        if (hint_number == (DATA_USES_MULTI_ROW_HEADERS | hint_number)) {
            System.out.println("We have to use multi row headers.");
        }
    }
}



