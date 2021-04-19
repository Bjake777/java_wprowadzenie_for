public class Zadanie9 {
    public static void main(String[] args) {
        char[] word = {'J', 'a', 'r', 'e', 'k'};

        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i]);
        }

        System.out.println();

        for (int i = word.length -1; i >= 0; i--) {
            System.out.print(word[i]);
        }
    }
}
