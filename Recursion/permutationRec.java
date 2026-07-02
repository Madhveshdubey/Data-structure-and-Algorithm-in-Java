public class permutationRec {

    public static void perm(String ans, String s) {
        if (s.length() == 0)
            System.out.println(ans);
        else {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                String left = s.substring(0, i);
                String right = s.substring(i + 1);
                perm(ans + ch, left + right);
            }
        }
    }

    public static void main(String[] args) {
        perm(" ","ABC");
    }

}
