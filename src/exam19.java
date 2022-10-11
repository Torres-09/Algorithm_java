public class exam19 {
    public static int[] solution(String[] keyinput, int[] board) {
        int x_point = 0;
        int y_point = 0;
        for (String s : keyinput) {
            if (s.equals("left")) {
                if(x_point-1<-board[0]/2)
                    continue;
                else x_point -= 1;
            } else if (s.equals("right")) {
                if (x_point + 1 > board[0] / 2) {
                    continue;
                } else x_point += 1;
            } else if (s.equals("up")) {
                if (y_point + 1 > board[1] / 2) {
                    continue;
                } else y_point += 1;
            } else if (s.equals("down")) {
                if (y_point - 1 < -board[1] / 2) {
                    continue;
                } else y_point -= 1;
            }
        }
        int[] answer = {x_point,y_point};
        return answer;
    }

    public static void main(String[] args) {
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};
        System.out.println(solution(keyinput, board));
    }
}
