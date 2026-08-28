class Solution {
    public boolean isValid(String s) {
        Stack<Character> symbols = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                symbols.push(ch);

            } else {
                if (symbols.isEmpty()) {
                    return false;
                }
                char top = symbols.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }

        }
        return symbols.isEmpty();
    }
}
