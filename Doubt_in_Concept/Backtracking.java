public class Backtracking {
    public static void printpermutation(String str, String permute, int idx) {
        if (str.length() == 0) {
            System.out.println(permute);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printpermutation(newStr, permute + currChar, idx + 1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printpermutation(str, "", 0);
    }
}
