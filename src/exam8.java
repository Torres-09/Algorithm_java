import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class exam8 {
    static long dp[][] = new long[101][101];

    public static long com(int n, int m) {
        if(dp[n][m]!=0)
            return dp[n][m];

        if(n==1||m==n)
            return 1;
        else if(m==0)
            return 1;
        else
            return dp[n][m] = com(n-1,m) + com(n-1,m-1);
    }

    public static long solution(int balls, int share) {
        for(int i =0;i<100;i++)
        {
            for(int j =0;j<100;j++)
            {
                dp[i][j] = 0;
            }
        }
        long answer = com(balls, share);
        return answer;
    }

    public static void main(String[] args) {
        int balls = 50;
        int share = 10;
        BigInteger bigInteger = new BigInteger("1");
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine engine = sem.getEngineByName("JavaScript");
        try {
            int num = (int) engine.eval("3+4");
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }
        int[] a = {1, 2};
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        System.out.println(solution(balls,share));
    }
}