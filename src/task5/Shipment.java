package task5;

public class Shipment {
    private Item[] items;
    private String deliveryMethod;
    private double maxWeight;

    public Shipment() {
        this.items = new Item[10];
        this.deliveryMethod = "";
    }

    public boolean addItem(Item item) {
        double itemWeight = item.getWeight();

        if (itemWeight <= 10.0) {
            deliveryMethod = "BicycleCourier";
            maxWeight = 10.0;
        } else if (itemWeight <= 100.0) {
            deliveryMethod = "Bus";
            maxWeight = 100.0;
        } else if (itemWeight <= 150.0) {
            deliveryMethod = "Train";
            maxWeight = 150.0;
        } else {
            deliveryMethod = "Truck";
            maxWeight = 200.0;
        }

        if (itemWeight <= maxWeight) {
            return true;
        } else {
            System.out.println("Error: Weight limit exceeded for delivery method: " + deliveryMethod);
            return false;
        }
    }
    public boolean cancelShipment() {
        return true;
    }
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
}
