public class Main {
    public static double getRandomNumber() {
        double getRandomNumber = (int) (Math.random() * (1000 - 100)) + 1;
        return getRandomNumber;
    }
    public static void main(String[] args) {
        double a = 0;
        double b = 21;
        double i;
        i =getRandomNumber() + a * b;

        System.out.println(i);
        }
    }
