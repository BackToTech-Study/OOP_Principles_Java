package backToTech;

public class Battery implements IfuelTank {
    @Override
    public void showTank() {
        System.out.println("Runs on " + EngineType.ELECTRIC + " Battery");
    }
}
