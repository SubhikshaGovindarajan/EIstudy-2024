// Main Class
public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Create an instance of the European plug
        EuropeanPlug europeanPlug = new EuropeanPlug();
        
        // Create an adapter for the European plug
        Plug adapter = new EuropeanPlugAdapter(europeanPlug);
        
        // Use the adapter to plug in the device
        adapter.plugIn();
    }
}
