//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Union-find with specific canonical element.
 * Add a method find() to the union-find data type so that find(i) returns the largest element in the connected
 * component containing i.
 * The operations, union(), connected(), and find() should all take logarithmic time or better.
 * For example, if one of the connected components is {1, 2, 6, 9}, then the find() method should
 * return 9 for each of the four elements in the connected components.
 */
public class Main {

    public static void main(String[] args) {
        int[] elements = {1, 2, 6, 9};
        System.out.println(find(9, elements));
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