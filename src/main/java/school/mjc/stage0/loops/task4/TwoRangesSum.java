package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(numberToSkip>lastInRow) System.out.println("number to skip is bugger then the last");
        if (lastInRow<0) System.out.println("last number in row is negative");
        int sum1=0, sum2=0;
        for (int i=1; i<=lastInRow; i++){
            if (i%numberToSkip==0) {
                sum1 += i;
                continue;
            }
            sum2+=i;
        }
        System.out.println("skipped sum is number" + sum1);
        System.out.println("counted sum is number" + sum2);
    }
}
