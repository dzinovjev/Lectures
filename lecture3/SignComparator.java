package lecture3;
public class SignComparator {
    public String compare(int number) {
        if (number < 0) {
            return "number is positive";
        } else if (number > 0) {
            return "number is negative";
        } else {
            return "number is 0"; }
    }
}