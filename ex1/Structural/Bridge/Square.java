// Refined Abstraction for Square
class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Square. ");
        color.applyColor();
    }
}
