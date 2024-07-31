// Main Class
public class BridgePatternDemo {
    public static void main(String[] args) {
        // Create colors
        Color red = new RedColor();
        Color blue = new BlueColor();

        // Create shapes
        Shape circle = new Circle(red);
        Shape square = new Square(blue);

        // Draw shapes with colors
        circle.draw();  // Output: Drawing Circle. Applying red color.
        square.draw();  // Output: Drawing Square. Applying blue color.
    }
}
