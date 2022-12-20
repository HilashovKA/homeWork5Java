import java.util.HashMap;

public class HomeWork14 {
    public static void main(String[] args) {
        HomeWork14 conv = new HomeWork14();
    
        System.out.println(conv.ConversionToInt2("III")); //3
        System.out.println(conv.ConversionToInt2("VI")); //6
        System.out.println(conv.ConversionToInt2("VII")); //7 2+5 = 7
        System.out.println(conv.ConversionToInt2("IX")); //9
        System.out.println(conv.ConversionToInt2("XIV")); //14 9+5 = 14
        System.out.println(conv.ConversionToInt2("XXIV")); //34 4+10+10 = 24 
    }

    public int ConversionToInt2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int end = s.length()-1;
        char[] arr = s.toCharArray();
        int arabian;
        int result = map.get(arr[end]);
        for (int i = end-1; i >=0; i--) {
            arabian = map.get(arr[i]);

            if (arabian < map.get(arr[i + 1])) {
                result -= arabian;
            } else {
                result += arabian;
            }

        }
        return result;

    }
}
