public class Cat extends Animal {
    private String poroda;
    public Cat(boolean isVegan, String food, String poroda){
        super(isVegan, food);
        this.poroda = poroda;
    }
    public String getPoroda(){
        return poroda;
    }
}
