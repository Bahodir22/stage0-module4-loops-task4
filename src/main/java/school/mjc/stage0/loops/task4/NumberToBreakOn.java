package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {

        if (numberToGoUntil<toBreakWith){
            System.out.println("iterating till the end");
        }
        for (int i=1; i<=numberToGoUntil; i++){
            if (i%toBreakWith==0) continue;
            System.out.println(i);
        }

    }
}
