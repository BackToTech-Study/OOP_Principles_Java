package backToTech;

public class FossilFuels implements IfuelTank {
    @Override
    public void showTank() {
        System.out.println("Runs on " + EngineType.DIESEL + "or " + EngineType.PETROL);
    }
}
