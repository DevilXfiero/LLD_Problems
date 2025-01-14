public class Restaurant {
    private String name;
    private String location;
    private Chef chef;
    private Menu menu;

    public Restaurant(String name, String location, Chef chef, Menu menu) {
        this.name = name;
        this.location = location;
        this.chef = chef;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }
}
