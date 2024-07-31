class BasicBook implements Book {
    @Override
    public String getDescription() {
        return "Basic Book";
    }

    @Override
    public double cost() {
        return 10.00;
    }
}

