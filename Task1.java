class Solution {
    public String reverseFrase(String s) {
        List<String> frase = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(frase);
        return String.join(" ", frase);
    }
}
class Solution {
    public String reverseFrase(String s) {
        List<String> frase = new ArrayList<>();
        int n = s.length();
        for (int i = 0; i < n;) {
            while (i < n && s.charAt(i) == ' ') {
                ++i;
            }
            if (i < n) {
                StringBuilder t = new StringBuilder();
                int j = i;
                while (j < n && s.charAt(j) != ' ') {
                    t.append(s.charAt(j++));
                }
                frase.add(t.toString());
                i = j;
            }
        }
        Collections.reverse(frase);
        return String.join(" ", frase);
    }
}
