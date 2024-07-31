class SpecialEditionDecorator extends BookDecorator {
    public SpecialEditionDecorator(Book book) {
        super(book);
    }

    @Override
    public String getDescription() {
        return book.getDescription() + ", Special Edition";
    }

    @Override
    public double cost() {
        return book.cost() + 15.00;
    }
}
