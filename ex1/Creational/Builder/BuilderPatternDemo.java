// Product
class Sandwich {
    private String breadType;
    private String meat;
    private String cheese;
    private String toppings;

    public Sandwich(String breadType, String meat, String cheese, String toppings) {
        this.breadType = breadType;
        this.meat = meat;
        this.cheese = cheese;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "breadType='" + breadType + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", toppings='" + toppings + '\'' +
                '}';
    }
}

// Builder Interface
interface SandwichBuilder {
    SandwichBuilder setBreadType(String breadType);
    SandwichBuilder setMeat(String meat);
    SandwichBuilder setCheese(String cheese);
    SandwichBuilder setToppings(String toppings);
    Sandwich build();
}

// Concrete Builder
class CustomSandwichBuilder implements SandwichBuilder {
    private String breadType;
    private String meat;
    private String cheese;
    private String toppings;

    @Override
    public SandwichBuilder setBreadType(String breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public SandwichBuilder setMeat(String meat) {
        this.meat = meat;
        return this;
    }

    @Override
    public SandwichBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public SandwichBuilder setToppings(String toppings) {
        this.toppings = toppings;
        return this;
    }

    @Override
    public Sandwich build() {
        return new Sandwich(breadType, meat, cheese, toppings);
    }
}

// Director
class SandwichDirector {
    private SandwichBuilder builder;

    public SandwichDirector(SandwichBuilder builder) {
        this.builder = builder;
    }

    public Sandwich constructClassicSandwich() {
        return builder.setBreadType("Whole Wheat")
                      .setMeat("Turkey")
                      .setCheese("Swiss")
                      .setToppings("Lettuce, Tomato, Mayo")
                      .build();
    }

    public Sandwich constructVeggieSandwich() {
        return builder.setBreadType("Sourdough")
                      .setMeat("None")
                      .setCheese("Cheddar")
                      .setToppings("Cucumber, Bell Peppers, Hummus")
                      .build();
    }
}

// Main Class
public class BuilderPatternDemo {
    public static void main(String[] args) {
        SandwichBuilder builder = new CustomSandwichBuilder();
        SandwichDirector director = new SandwichDirector(builder);

        Sandwich classicSandwich = director.constructClassicSandwich();
        Sandwich veggieSandwich = director.constructVeggieSandwich();

        System.out.println(classicSandwich);
        System.out.println(veggieSandwich);
    }
}
