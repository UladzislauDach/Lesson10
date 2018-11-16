public class Animal {
    private boolean isVegetarian;
    protected String food;

    public Animal() {
    }

    public Animal(boolean isVegan, String food) {
        this.isVegetarian = isVegan;
        this.food = food;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public String getFood() {
        return food;
    }

}
