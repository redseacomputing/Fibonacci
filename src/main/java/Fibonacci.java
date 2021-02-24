public class Fibonacci {

    int last = 0;
    int actual = 1;
    int result = 0;
    public int getFibonacciOf(int number) {
        if (number < 3) {
            if (number == 0) {
                return 0;
            } else return 1;
        } else {
            for (int i = 1; i < number; i++) {
                result = last + actual;
                last = actual;
                actual = result;
            }
        } return result;
    }
}
