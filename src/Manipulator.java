public class Manipulator {
    Manipulator() {
    }

    // return a reversed integer
    public int reverseInt(int number) {
        int multiplier = 1;
        int reversedInt = 0;

        while(number % multiplier != number) {
            multiplier *= 10;
        }

        while(number % multiplier != 0) {
            multiplier /= 10;
            reversedInt += number % 10 * multiplier;
            number /= 10;
        }
        return reversedInt;
    }

    public static void main(String[] args) {

        Manipulator manipulator = new Manipulator();
        int actual = 1738;
        System.out.print("In goes:     ");
        System.out.println(actual);
        System.out.print("Out comes:   ");
        System.out.println(manipulator.reverseInt(actual));
    }
}
