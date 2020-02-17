public class EnumTest {
    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void tellUsHowIsTheDay() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellUsHowIsTheDay();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellUsHowIsTheDay();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellUsHowIsTheDay();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellUsHowIsTheDay();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellUsHowIsTheDay();
    }
}
