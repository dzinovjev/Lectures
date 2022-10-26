package lecture3;
public class Task2 {
    public static void main(String[] args) {
        int dayOfTheWeek = 1;
        switch (dayOfTheWeek) {
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tue");
            break;
            case 3: System.out.println("Wed");
            break;
            case 4: System.out.println("Thu");
            break;
            case 5: System.out.println("Fri");
            break;
            case 6: System.out.println("Sat");
            break;
            case 7: System.out.println("Sun");
            break;
            default: System.out.println("WTF?");
        }
    }
}