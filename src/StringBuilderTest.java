public class StringBuilderTest {
    public static void solution() {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("abc"));
        System.out.println(sb.insert(2, "kk"));

        // 0 ~ 1까지 삭제
        System.out.println(sb.delete(0,2));
        System.out.println(sb.deleteCharAt(2));

        sb.setCharAt(0, 'h');
        System.out.println(sb);

        System.out.println(sb.reverse());
        

        sb.setLength(4);
        System.out.println("sb = " + sb);
        sb.setLength(1);
        System.out.println("sb = " + sb);
    }

    public static void main(String[] args) {
        solution();
    }
}
