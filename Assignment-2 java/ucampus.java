class FoodItem{
    int itemId;
    String itemName;
    double price;

    static String cafeteriaName = "UCampus Cafeteria";
    static double serviceCharge = 10.0;
    static int totalFoodItems = 0;
   double finalPrice;

    void addFoodItem(int id, String name, double pri){
        itemId=id;
        itemName=name;
        price=pri;
        totalFoodItems+=1;
    }

    void calculateFinalPrice() {
        finalPrice = price + (price * serviceCharge / 100);
    }

    void displayItemDetails() {
        System.out.println(itemId);
        System.out.println(itemName);
        System.out.println(price);       
        System.out.println(finalPrice);  
}
        
    static void changeServiceCharge(double newCharge){
    serviceCharge=newCharge;
    }

    static void displayCafeteriaDetails(){
        System.out.println(FoodItem.cafeteriaName);
        System.out.println(FoodItem.serviceCharge);
        System.out.println(FoodItem.totalFoodItems);
}
}
public class ucampus {
    public static void main(String[] args) {
    FoodItem item1 = new FoodItem();
    FoodItem item2 = new FoodItem();
    FoodItem item3 = new FoodItem();
    item1.addFoodItem(101, "Veg Sandwich", 80);
    item2.addFoodItem(102, "Cold Coffee", 120);
    item3.addFoodItem(103, "Paneer Wrap", 150);
    item1.calculateFinalPrice();
    item2.calculateFinalPrice();
    item3.calculateFinalPrice();
    FoodItem.displayCafeteriaDetails();
    item1.displayItemDetails();
    item2.displayItemDetails();
    item3.displayItemDetails();
    FoodItem.changeServiceCharge(15);
    item1.calculateFinalPrice();
    item2.calculateFinalPrice();
    item3.calculateFinalPrice();

    System.out.println("After Updating Service Charge");

    item1.displayItemDetails();
    item2.displayItemDetails();
    item3.displayItemDetails();
}
    }
