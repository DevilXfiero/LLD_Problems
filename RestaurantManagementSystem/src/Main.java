import java.util.List;

public class Main {
    public static void main(String[] args) {
        Chef fiveStarChef = new Chef("Bhola", "bholabhala@gmail.com", "9123123123");

        Menu menu = new Menu("Sbka Restaurant Menu", "Menu for sbka restaurant");
        List<MenuItem> menuItems = List.of(
                new MenuItem("Dal makhni", "special veg dal", 200),
                new MenuItem("Paneer Butter Masala", "buttery paneer gravy", 400),
                new MenuItem("Jeera Rice", "Special basmati jeera rice", 150)
        );

        menuItems.forEach(menu::addMenuItem);


        Restaurant restaurant = new Restaurant("Sbka Restaurant", "Online", fiveStarChef, menu);





    }
}