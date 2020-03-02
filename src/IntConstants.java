public class IntConstants {

    private IntConstants() {
        throw new UnsupportedOperationException();
    }

    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_GRANNY_SMITH = 2;

    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;
}


class TestIntConstants {
    public static void main(String[] args) {
        // This is absolutely fine
        consumeAppleType(IntConstants.APPLE_FUJI);

        // Will this compile...?
//        consumeAppleType(IntConstants.ORANGE_BLOOD);
    }

    static void consumeAppleType(int appleType) {
        // do nothing
    }
}
