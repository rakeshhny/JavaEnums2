public class OperationClient {
    public static void main(String[] args) {
        double x = Double.valueOf(0.01);
        double y = Double.valueOf(0.02);

        // Enum provides useful methods values() and name()
//        for (Operation operation : Operation.values()) {
//            System.out.println(operation.name() + " = " + operation.apply(x,y));
//        }

        // ConstantSpecificOperation1
//        for (ConstantSpecificOperation1 operation : ConstantSpecificOperation1.values()) {
//            System.out.println(operation.name() + " = " + operation.apply(x,y));
//        }

        // ConstantSpecificOpAndData
//        for (ConstantSpecificOpAndData opAndData : ConstantSpecificOpAndData.values()) {
//            System.out.println(x + "" + opAndData + y + " = " + opAndData.apply(x,y));
//        }

        // ConstantSpecificOpAndData - Reverse lookup
//        System.out.println(ConstantSpecificOpAndData.fromString("+").get().name());
    }
}
