public class exam17 {
    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        denum1 *= num2;
        denum2 *= num1;
        num2 *= num1;
        denum1 += denum2;
        for(int i=2;i<=denum1;){
            if(denum1%i==0&&num2%i==0){
                denum1 /= i;
                num2 /= i;
            }else{
                i++;
            }
        }

        int[] answer = {denum1,num2};
        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(2, 999, 1, 999);
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
