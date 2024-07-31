abstract class BookDecorator implements Book {
    protected Book book;

    public BookDecorator(Book book) {
        this.book = book;
    }

    @Override
    public String getDescription() {
        return book.getDescription();
    }

    @Override
    public double cost() {
        return book.cost();
    }
}
