import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void solution() {
        List<String> list = new ArrayList<>();
        list.add("서울");
        list.add(0, "대전");
        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.add("울산");
        list.addAll(list2);
        System.out.println(list);

        System.out.println(list.get(0));
        list.set(0, "인천");
        System.out.println("list = " + list);

        System.out.println(list.indexOf("인천"));
        System.out.println(list.lastIndexOf("인천"));

        list.remove(0);
        System.out.println(list);
        
        // 없으면 false , 있으면 가장 앞에 있는 element 삭제
        System.out.println(list.remove("인천"));

        // list2에 있는 거 전부 삭제
        list.removeAll(list2);
        System.out.println(list);
        list.addAll(list2);
        
        // list2에 있는 거 제외하고 삭제
        list.retainAll(list2);
        System.out.println(list);
        list.removeIf(a -> a == "울산");
        System.out.println(list);
    }

    public static void main(String[] args) {
        solution();
    }
}
