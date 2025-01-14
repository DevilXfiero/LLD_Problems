import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String title;
    private String description;
    private List<MenuItem> menuItems;

    public Menu(String title, String description) {
        this.title = title;
        this.description = description;
        this.menuItems = new ArrayList<>();
    }

    public boolean addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
        return true;
    }

    public void print() {
        System.out.println("---------" + this.title + "---------");
        System.out.println();
        System.out.println(this.description);

        for(int i=0; i<this.menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
            System.out.println();
        }
    }

}
