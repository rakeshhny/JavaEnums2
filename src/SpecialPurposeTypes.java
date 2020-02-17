@CacheControl
public class SpecialPurposeTypes {
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY);
    }
}

// A kind of a class called am EnumType
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}


// A kind of an interface called an Annotation
@interface CacheControl {

}