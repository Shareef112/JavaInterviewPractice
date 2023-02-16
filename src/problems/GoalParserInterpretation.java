package problems;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));
    }
    public static String interpret(String command) {
      return  command.replace("()","o").replace("(","").replace(")","");
    }
}
