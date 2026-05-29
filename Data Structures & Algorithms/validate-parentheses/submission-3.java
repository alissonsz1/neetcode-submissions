class Solution {
    public boolean isValid(String s) {
        Stack<Character> pilha = new Stack<>();
        Map<Character, Character> fecha = new HashMap<>();
        char [] charArray = s.toCharArray();

        fecha.put(')' , '(');
        fecha.put(']' , '[');
        fecha.put('}' , '{');

        for( char c : charArray){
            if(fecha.containsKey(c)){
                if(!pilha.isEmpty() && pilha.peek() == fecha.get(c)){
                    pilha.pop();
                } else {
                    return false;
                }
            } else {
                pilha.push(c);
            }
            
        }
        return pilha.isEmpty();
    }
}
