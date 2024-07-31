class SignedEditionDecorator extends BookDecorator {
    public SignedEditionDecorator(Book book) {
        super(book);
    }

    @Override
    public String getDescription() {
        return book.getDescription() + ", Signed Edition";
    }

    @Override
    public double cost() {
        return book.cost() + 10.00;
    }
}

