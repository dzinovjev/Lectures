package lecture2;
    public class Task1 {
    public static void main(String[] args) {
        int soundLevel = 10;
        if ((soundLevel<=39)) {
            System.out.println("Faint");
        }
        if ((soundLevel >40) || (soundLevel <=69)) {
            System.out.println("Moderate");
        }
        if ((soundLevel >70) || (soundLevel <=99)) {
            System.out.println("Very Loud");
        }
        if ((soundLevel >100) || (soundLevel <=129)) {
            System.out.println("Extremely Loud");
        }
        if ((soundLevel>130)) {
            System.out.println("Painful");
    }
  }
}