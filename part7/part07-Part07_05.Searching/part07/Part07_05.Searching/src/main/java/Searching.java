
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println();

        System.out.println();
        System.out.println("Searching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        final int[] result = {-1};
        books.forEach(book -> {
            if (book.getId() == searchedId) {
                result[0] = books.indexOf(book);
            }
        });

        return result[0];
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int l = 0;
        int r = books.size() - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (books.get(m).getId() == searchedId) {
                return m;
            }

            if (books.get(m).getId() < searchedId) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;
    }
}

