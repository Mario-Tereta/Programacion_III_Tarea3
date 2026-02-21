package umg.edu.gt.datastructure;

public class SymbolValidator {

    public boolean isValid(String expression) {

        CustomStack<Character> stack = new CustomStack<>();

        for (char ch : expression.toCharArray()) {

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) return false;

                char open = stack.pop();

                if (!isMatching(open, ch)) return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}