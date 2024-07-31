class HardcoverDecorator extends BookDecorator {
    public HardcoverDecorator(Book book) {
        super(book);
    }

    @Override
    public String getDescription() {
        return book.getDescription() + ", Hardcover";
    }

    @Override
    public double cost() {
        return book.cost() + 5.00;
    }
}
