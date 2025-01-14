import java.util.ArrayList;
import java.util.List;

public class Meal {

    private TableSeat tableSeat;
    private List<MealItem> mealItems;

    public Meal(TableSeat tableSeat, List<MealItem> mealItems) {
        this.tableSeat = tableSeat;
        this.mealItems = mealItems;
    }

    public Meal(TableSeat tableSeat) {
        this.tableSeat = tableSeat;
        this.mealItems = new ArrayList<>();
    }

    public boolean addMealItem(MealItem mealItem) {
        this.mealItems.add(mealItem);
        return true;
    }
}
