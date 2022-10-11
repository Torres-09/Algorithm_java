import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.List;

public class exam20 {
    public static String[] solution(String[] quiz){
        List<String> list = new ArrayList<>();

        ScriptEngineManager scm = new ScriptEngineManager();
        ScriptEngine scriptEngine = scm.getEngineByName("JavaScript");

        for (String s : quiz) {
            s = s.trim();
            String[] split = s.split("=");
            try {
                if (scriptEngine.eval(split[0]).equals(scriptEngine.eval(split[1]))) {
                    list.add("O");
                } else list.add("X");
            } catch (ScriptException e) {
                throw new RuntimeException(e);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(solution(quiz));

    }
}
