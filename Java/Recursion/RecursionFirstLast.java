//first and last occurance of an element in a string
public class RecursionFirstLast {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println("First occurance of " + element + " is at " + first);
            System.out.println("Last occurance of " + element + " is at " + last);
            return;
        }

        char currchar = str.charAt(idx);
        if (currchar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurance(str, 0, 'a');

    }
}
