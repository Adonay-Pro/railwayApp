package railwayapp;

public class RailroadToxicMaterials extends HeavyFreightCar implements Railroad {

    String toxicMaterial;//Chlorine, Ammonia, Sulfuric acid, Pesticides
    Boolean lockingMechanism = false;

    public RailroadToxicMaterials(double length, double capacity, String toxicMaterial, Boolean lockingMechanism) {
        super(length, capacity);
        this.toxicMaterial = toxicMaterial;
        this.lockingMechanism = lockingMechanism;
    }
}
