import java.util.Scanner;

public class Recursion_lvl2 {
    public static void towerHanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println(n + " from " + src + " => " + dest);
            return;
        }
        towerHanoi(n - 1, help, dest, help);
        System.out.println(n + " from " + src + " => " + dest);
        towerHanoi(n - 1, help, src, dest);
    }

    public static void printRev(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printRev(str, index - 1);
    }

    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int index, char ele) {
        if (index == str.length()) {
            System.out.print("1st occ: " + first + " | 2nd occ: " + last);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == ele) {
            if (first == -1)
                first = index;
            else
                last = index;
        }
        findOccurance(str, index + 1, ele);
    }

    public static void main(String[] args) {
        // System.out.print("Enter the number: ");
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();

        // towerHanoi(x, "S", "H", "D");

        String str = "abcd";
        printRev(str, str.length() - 1);

        String strI = "abaacdaefaah";
        findOccurance(strI, 0, 'a');
    }
}
