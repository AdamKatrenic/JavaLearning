public class OddNumbers {
    public static void main(String[] args) {
        sumOdd(1,100);
        sumOdd(-1,100);
        sumOdd(100,100);
        sumOdd(13,13);
        sumOdd(100,-100);
        sumOdd(100,1000);
    }

    public static boolean isOdd(int number) {
        if(number>0){
            if(number%2==1){
                return true;
            }else {
                return false;
            }
        }else return false;
    }



    public static void sumOdd(int start, int end){

        int sumofOdd=0;

        if ((end > start) || (start == end)){
            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    sumofOdd = sumofOdd + i;
                }
            }
        } else if (!isOdd(start) || !isOdd(end)) {
            System.out.println(-1);
        }

        System.out.println(sumofOdd);
    }
}
