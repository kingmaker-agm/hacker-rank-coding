package domains.algorithms.implementation;

import java.io.*;

/**
 * @link <a href="https://www.hackerrank.com/challenges/drawing-book/problem?isFullScreen=true">Challenge</a>
 *
 * A teacher asks the class to open their books to a page number. A student can either start turning pages from the
 * front of the book or from the back of the book. They always turn pages one at a time. When they open the book, page 1
 * is always on the right side:
 *
 * When they flip page 1, they see pages 2 and 3. Each page except the last page will always be printed on both sides.
 * The last page may only be printed on the front, given the length of the book. If the book is n pages long, and a
 * student wants to turn to page p, what is the minimum number of pages to turn?
 * They can start at the beginning or the end of the book.
 *
 * Given n and p, find and print the minimum number of pages that must be turned in order to arrive at page .
 */

public class DrawingBook {
    public static int pageCount(int n, int p) {
        if (p > n /2) {
            return turnsFromLast(p, n);
        }
        else {
            return turnsFromBeginning(p);
        }
    }

    public static int turnsFromBeginning(int targetPage) {
        int turns = 0;
        int currentRightPage = 1;

        while (currentRightPage < targetPage) {
            turns++;
            currentRightPage += 2;
        }
        return turns;
    }

    public static int turnsFromLast(int target, int lastPage) {
        boolean onlyOnePageAtLast = lastPage % 2 == 0;
        int turns = 0;
        int currentLeftPage = onlyOnePageAtLast ? lastPage : (lastPage - 1);

        while (currentLeftPage > target) {
            turns++;
            currentLeftPage -= 2;
        }

        return turns;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
