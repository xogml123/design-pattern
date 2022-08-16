package iterator;

public class BookShelfIterator implements Iterator{
    private Book[] books;
    private int position = 0;

    public BookShelfIterator(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        if (books.length > position && books[position] != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = books[position];
        position +=1;
        return book;
    }
}
