package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int temp = 1;
        int count = 1;
        int mult = 1;
        while (temp <= printToInclusive) {
            while (count <= temp) {
                mult *= count;
                count++;
            }
            System.out.println(mult);
            temp++;
        }
    }
}
