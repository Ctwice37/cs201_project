package marketPackage;

import java.util.ArrayList;

public class Market {

    private static ArrayList<String> foodItems;
    private static String foodItem;



    public static void setFoodItem(String foodItem) {
        Market.foodItem = foodItem;
    }

    public static int numFoodItems(){
        return foodItems.size();
    }
    public static ArrayList<String> getFoodItems() {
        return foodItems;
    }
}
