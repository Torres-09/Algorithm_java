public class exam1 {

    public static String solution(String letter) {

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String strings[] = letter.split(" ");
        String answer = "";
        for (String i : strings) {
            for (int j = 0; j < morse.length; j++) {
                if (i.equals(morse[j]))
                    answer += String.valueOf((char)('a'+j));
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        System.out.println(solution(letter));
    }
}
