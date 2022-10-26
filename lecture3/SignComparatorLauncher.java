package lecture3;
public class SignComparatorLauncher {
    public static void main(String[] args) {
        SignComparator signComporator = new SignComparator();
        System.out.println(signComporator.compare(0));
        System.out.println(signComporator.compare(-1));
        System.out.println(signComporator.compare(1));
    }
}