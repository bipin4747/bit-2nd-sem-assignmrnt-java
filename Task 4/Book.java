class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "[" + title + " by " + author + ", ISBN: " + isbn + "]";
    }

    // For use in HashSet (equality based on ISBN)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book b = (Book) obj;
        return isbn.equals(b.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }
}
