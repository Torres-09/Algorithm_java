public class exam2 {

    public static int factorial(int n){
        if(n == 1|| n==0)
            return 1;
        else
            return factorial(n-1) * n;
    }
    public static int solution(int n) {
        int answer = 0;

        for(int i =0;i<=10;i++)
        {
            int temp = factorial(i);
            if(temp>n)
            {
                answer = i-1;
                break;
            }else if(temp==n){
                answer= i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 3628800;
        System.out.println(solution(n));
    }
}
