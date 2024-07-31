public class DecoratorPatternDemoBook {
    public static void main(String[] args) {
        Book book = new BasicBook();
        System.out.println(book.getDescription() + " costs $" + book.cost());

        Book hardcoverBook = new HardcoverDecorator(book);
        System.out.println(hardcoverBook.getDescription() + " costs $" + hardcoverBook.cost());

        Book signedHardcoverBook = new SignedEditionDecorator(hardcoverBook);
        System.out.println(signedHardcoverBook.getDescription() + " costs $" + signedHardcoverBook.cost());

        Book deluxeBook = new SpecialEditionDecorator(signedHardcoverBook);
        System.out.println(deluxeBook.getDescription() + " costs $" + deluxeBook.cost());
    }
}
