import java.util.*;
import java.util.stream.Collectors;

public class ListArray {
    public static void solution() {
        String temp = "abcde";
        // 새로운 객체를 생성해서 변환해주어야지 배열과 리스트가 동기화되지 않는다. 그저 arrys.aslist() 이런식으로 넘겨주면 list가 생성되는 것이 아니라 listView만 생성되는 꼴이다.

        List<String> list = new ArrayList<>(Arrays.asList(temp));
        System.out.println(list);
        list.add("123");
        System.out.println("list = " + list);

        String arr[] = list.toArray(new String[list.size()]);
        System.out.println("arr.toString() = " + arr.toString());

        List<String> list2 = new ArrayList<>();
        String temp2[] = list.toArray(new String[list.size()]);
        System.out.println("temp2 = " + temp2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(4);
        list3.add(5);
        int temp3[] = list3.stream()
                .mapToInt(i -> i).toArray();
        for (int i : temp3) {
            System.out.println(i);
        }

        Collections.reverse(list3);
        for (Integer integer : list3) {
            System.out.println("integer = " + integer);
        }

        Collections.sort(list3);
        Collections.sort(list3, Collections.reverseOrder());
        for (Integer integer : list3) {
            System.out.println("integer = " + integer);
        }

        System.out.println(Collections.frequency(list3, 3));
        System.out.println(list3);
        Collections.sort(list3);

        System.out.println(Collections.binarySearch(list3,5));

        // primitive 타입 (int , char 와 같은 배열을 list로 만들기 위해서는 반복문을 사용하거나 java 8의 stream 이용해야만 가능하다)
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        int answer[] = list1.stream().mapToInt(i -> i).toArray();
        for (int i : answer) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        solution();
    }
}
