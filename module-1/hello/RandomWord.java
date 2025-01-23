/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

/**
 * RandomWord.java
 * <p>
 * This program reads a sequence of words from standard input and prints one of those words
 * uniformly at random. The program uses Knuth's method to select the word without storing
 * all the words in an array or list. Instead, it processes the words one at a time and
 * selects the ith word with probability 1/i to be the champion, replacing the previous
 * champion. After reading all the words, the program prints the surviving champion.
 * <p>
 * The program uses the following library functions from algs4.jar:
 * - StdIn.readString(): Reads and returns the next word from standard input.
 * - StdIn.isEmpty(): Returns true if there are no more words to read.
 * - StdOut.println(): Prints the champion to standard output.
 * - StdRandom.bernoulli(p): Returns true with probability p and false with probability 1-p.
 * <p>
 * Example usage:
 * Input:  apple banana cherry date
 * Output: One of the words (apple, banana, cherry, or date) is printed uniformly at random.
 * <p>
 * Knuth's method ensures that each word has an equal probability of being selected as the
 * champion, regardless of the order in which the words are read.
 *
 * @author Zdravko Stanin
 * @version 1.0
 */
public class RandomWord {
    public static void main(String[] args) {
        String champion
                = ""; // store the champion here (e.g. the word that might be printed at the end)
        int index = 0;

        // read words until no words are provided from Standard input
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            index++;

            // the first word is always the champion
            if (index == 1) {
                champion = word;
            }
            // for subsequent words, replace the champion with probability 1 / index
            else if (StdRandom.bernoulli(1.0 / (double) index)) {
                champion = word;
            }
        }
        System.out.println(champion);
    }
}
