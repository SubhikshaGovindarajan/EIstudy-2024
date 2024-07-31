// Adapter
class EuropeanPlugAdapter implements Plug {
    private EuropeanPlug europeanPlug;

    public EuropeanPlugAdapter(EuropeanPlug europeanPlug) {
        this.europeanPlug = europeanPlug;
    }

    @Override
    public void plugIn() {
        // Adapt the European plug to the Target interface
        europeanPlug.plugIntoEuropeanSocket();
    }
}
