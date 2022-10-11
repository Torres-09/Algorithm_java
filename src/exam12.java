public class exam12 {
    public static String solution(String[] id_pw, String[][] db) {
        String answer = "fail";

        for (String[] strings : db) {
            if (strings[0].equals(id_pw[0])) {
                if (strings[1].equals(id_pw[1])) {
                    answer = "login";
                } else answer = "wrong pw";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        System.out.println(solution(id_pw,db));
    }

}
