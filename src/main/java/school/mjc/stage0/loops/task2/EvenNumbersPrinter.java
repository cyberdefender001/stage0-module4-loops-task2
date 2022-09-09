package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int temp = 2;
        while (temp < printTillInclusive) {
            System.out.println(temp);
            temp += 2;
        }
    }
}
