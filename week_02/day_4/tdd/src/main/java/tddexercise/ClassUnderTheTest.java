package tddexercise;

public class ClassUnderTheTest {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;


    }

}
