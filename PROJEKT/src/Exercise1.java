public class Exercise1 {

    public static void main(String[] args) {

    }

    public static boolean isOdd(int number){
        if (number < 0){
            return false;
        }else if (number % 2 == 0){
            return true;
        }else return false;
    }



    public static void sumOdd(int start, int end){

        int oddnumbers=0;

        if (end > start){
            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    oddnumbers++;
                }
            }
        }
        System.out.println(oddnumbers);
    }
}
