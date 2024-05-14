package Template;

public abstract class PastaDish {
    public final void makeRecipe(){
        boilWater();
        addPasta();
        cookPasta();
        drainAndPlate();
        addSauce();
        addProtein();
        addGarnish();

    }



    abstract void addPasta();
    abstract void addProtein();
    abstract void addSauce();
    abstract void addGarnish();
    private void boilWater(){
        System.out.println("Boiling water");
    };
    private void cookPasta() {
        System.out.println(" cook Pasta");
    }

    private void drainAndPlate() {
        System.out.println("Drain And Plate");
    }
}
