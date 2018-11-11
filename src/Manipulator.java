public class Manipulator {
    Manipulator() {
    }

    // return an integer from a streing
    public static int getIntFromString(String s) {
        return Integer.valueOf(s.replaceAll("\\D+", "").trim());
    }

    // return a reversed integer
    public int reverseInt(int number) {

        int arrLength = 1;

        int forward = 0;

        int reversed = 0;

        int counter = 0;

        while(forward != number) {
            arrLength *= 10;
            counter++;
            forward = number % arrLength;

        }
        while(counter > 0) {
            arrLength /= 10;
            reversed += forward % 10 * arrLength;
            forward /= 10;
            counter--;
        };

        return reversed;
    }

    public static void main(String[] args) {
        String s = "234";
        System.out.println(getIntFromString(s));
    }
}
