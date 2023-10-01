package task5;

public class DeliveryService {
    public static void main(String[] args) {

        Customer customer = new Customer("John Doe", "123 Main St");
        System.out.println(customer.toString());

        ReceivePoint receivePoint = new ReceivePoint("456 Elm St");
        DeparturePoint departurePoint = new DeparturePoint("789 Oak St");

        Shipment shipment = new Shipment();
        shipment.setMaxWeight(200.0);

        Item item1 = new Item("Blocks", 120.0, 20.0);
        Item item2 = new Item("Gadget", 15.0, 15.0);

        if (shipment.addItem(item1)) {
            System.out.println("Item 1 added to shipment with delivery method: " + shipment.getDeliveryMethod());
        }

        if (shipment.addItem(item2)) {
            System.out.println("Item 2 added to shipment with delivery method: " + shipment.getDeliveryMethod());
        }

        if (shipment.cancelShipment()) {
            System.out.println("Shipment canceled");
        }

        System.out.println("Delivery method: " + shipment.getDeliveryMethod());
        System.out.println("Max weight for this shipment: " + shipment.getMaxWeight() + " kg");
    }
}
