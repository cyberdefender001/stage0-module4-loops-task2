package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int temp = 1;
        int mult = 1;
        while (temp < multiplyByAndToInclusive) {
            mult *= temp;
            System.out.println(mult);
            temp ++;
        }
    }
}
