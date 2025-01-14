public class MealItem {

    private int quantity;
    private MenuItem menuItem;

    public MealItem(int quantity, MenuItem menuItem) {
        this.quantity = quantity;
        this.menuItem = menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }
}
