package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int temp = 0;
        int pow = 0;
        while (temp <= power) {
            pow = 2 * temp;
            System.out.println(pow);
            temp++;
        }
    }
}
