package iterator;

public class BookShelf implements Aggregate{

    private int size;
    private int curr = 0;
    private Book[] books;
    public BookShelf(int size) {
        this.size = size;
        books = new Book[size];
    }

    public void appendBook(Book book) {
        books[curr] = book;
        ++curr;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(books);
    }

    @Override
    public int getLength() {
        return curr;
    }

}
