import java.util.*;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // List of all books in the library
        List<Book> libraryBooks = new ArrayList<>();
        libraryBooks.add(new Book("1984", "George Orwell", "ISBN001"));
        libraryBooks.add(new Book("To Kill a Mockingbird", "Harper Lee", "ISBN002"));
        libraryBooks.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "ISBN003"));
        libraryBooks.add(new Book("Java Programming", "James Gosling", "ISBN004"));

        // Set of borrowed books
        Set<Book> borrowedBooks = new HashSet<>();

        // Map of member ID to list of borrowed books
        Map<Integer, List<Book>> memberBorrowMap = new HashMap<>();

        // Member 101 borrows 2 books
        int memberId1 = 101;
        List<Book> member1Books = new ArrayList<>();
        member1Books.add(libraryBooks.get(0));
        member1Books.add(libraryBooks.get(1));
        borrowedBooks.addAll(member1Books);
        memberBorrowMap.put(memberId1, member1Books);

        // Member 102 borrows 1 book
        int memberId2 = 102;
        List<Book> member2Books = new ArrayList<>();
        member2Books.add(libraryBooks.get(2));
        borrowedBooks.addAll(member2Books);
        memberBorrowMap.put(memberId2, member2Books);
        
        // ---- Display All Books Using Enhanced For Loop ----
        System.out.println("All Library Books:");
        for (Book book : libraryBooks) {
            System.out.println(book);
        }

        // ---- Display Borrowed Books Using Iterator ----
        System.out.println("\nBorrowed Books:");
        Iterator<Book> iterator = borrowedBooks.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // ---- Display Borrowed Books Per Member ----
        System.out.println("\nMember-wise Borrowed Books:");
        for (Map.Entry<Integer, List<Book>> entry : memberBorrowMap.entrySet()) {
            System.out.println("Member ID: " + entry.getKey());
            displayBooks(entry.getValue());  // Demonstrates wildcard
        }
    }

    // Method with wildcard (upper bounded wildcard usage)
    public static void displayBooks(List<? extends Book> books) {
        for (Book book : books) {
            System.out.println("  -> " + book);
        }
    }
}
