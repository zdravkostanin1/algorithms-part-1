//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int[] elements = {1, 2, 6, 9};
        System.out.println(find(7, elements));
    }

    public static int find(int i, int[] elements) {
        int index = 0;

        while (index < elements.length) {
            index++;
            if (elements[index] == i) {
                return elements[index];
            }
        }
        return 0;
    }
}