import java.util.HashMap;

public class Main {

    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        int prev = 0;

        for (int i = s.length() - 1 ; i >= 0 ; i--) {
            int val = map.get(s.charAt(i));
            if (val < prev) {
                sum -= val;
            } else  {
                sum += val;
                prev = val;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Main().romanToInt("III"));
        System.out.println(new Main().romanToInt("IV"));
        System.out.println(new Main().romanToInt("IX"));
        System.out.println(new Main().romanToInt("LVIII"));
        System.out.println(new Main().romanToInt("MCMXCIV"));
    }
}


