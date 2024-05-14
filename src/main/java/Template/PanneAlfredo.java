package Template;

public class PanneAlfredo extends PastaDish{

    @Override
    void addPasta() {
        System.out.println("Add penne");
    }

    @Override
    void addProtein() {
        System.out.println("Add chicken");
    }

    @Override
    void addSauce() {
        System.out.println("Add Alfredo sauce");
    }

    @Override
    void addGarnish() {
        System.out.println("Add parsley");
    }
}
