public class SumChallenge {
    public static void main(String[] args) {

        int countofmatches = 0;
        int sumofmatches = 0;

        for (int loopnumber = 1; loopnumber <= 1000; loopnumber++) {
            if ((loopnumber % 3 == 0)  && (loopnumber % 5 == 0)) {
                countofmatches++;
                sumofmatches += loopnumber;
                System.out.println("nasiel som: " + loopnumber);
            }
            if (countofmatches == 5){
                break;
            }
        }
        System.out.println(sumofmatches );
    }
}
