import java.util.*;

public class StringTest {
    public static void solution() {
        String str = "abcdeabcdd";
        StringBuilder str2 = new StringBuilder("abcdeabcdd");
        System.out.println(str.length());
        System.out.println(str.isEmpty());

        // 범위 벗어나면 오류
        System.out.println(str.charAt(2));

        // 없으면 -1 리턴
        System.out.println(str.indexOf("bce"));
        System.out.println(str.lastIndexOf("c"));

        System.out.println(str.substring(2,4));
        System.out.println(str.substring(3));

        // str 이 변경되지는 않고 새로운 문자열이 출력된다.
        str.replace('d', 'k');
        System.out.println(str);

        System.out.println(str.equals("abcdeabcdd"));
        System.out.println(str.contains("dd"));
        String list[] = str.split("d");
        for (String s : list) {
            System.out.println(s);
        }

        String str4 = " abc ";
        // trim 역시 원래 문자열에 변경을 가하지는 않음
        System.out.println(str4.trim());
        System.out.println(str4);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase(Locale.ROOT));
        str.toUpperCase();
        System.out.println("str = " + str);
        // 같으면 0 , 앞이면 -1 , 뒤면 1 , 길이가 다르면 길이차이 return
        System.out.println(str.compareTo("abc"));
        int a = Integer.parseInt("300");
        System.out.println("a = " + a);
        String Int = Integer.toString(a);
        System.out.println("Int = " + Int);
        List<Integer> list1 = new ArrayList();
        list1.stream().sorted().mapToInt(i -> i).toArray();
        str.toLowerCase();

        String my_string = "asDSs";
        List<Character> list4 = new ArrayList();
        for(int i =0;i<my_string.length();i++)
        {
            list4.add(my_string.toLowerCase().charAt(i));
        }
        Collections.sort(list4);

        System.out.println(list4.toString());
        char strc[] = str.toCharArray();
        System.out.println(strc[0]);

        str.replace("abc","");
    }

    public static void main(String[] args) {
        solution();
    }

}
