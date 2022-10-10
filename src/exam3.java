public class exam3 {
    public static int solution(String A, String B) {
        int answer = -1;

        StringBuilder sb = new StringBuilder(A);
        for (int i = 0; i < B.length(); i++) {
            if (sb.toString().equals(B)) {
                answer = i;
            }

            sb.insert(0, sb.charAt(sb.length() - 1));
            sb.deleteCharAt(B.length());
            System.out.println(sb);
        }
        return answer;
    }

    public static void main(String[] args) {
        String A = "hello";
        String B = "ohell";
        System.out.println(solution(A, B));
        ;
    }
}
