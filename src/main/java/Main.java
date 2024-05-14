import Template.PanneAlfredo;
import Template.PastaDish;
import Template.SpaghettiMeatballs;

public class Main  {
    public static void main(String[] args) {

        PastaDish spaghettiMeatballs = new SpaghettiMeatballs();
        spaghettiMeatballs.makeRecipe();
        System.out.println(spaghettiMeatballs);

        System.out.println("------------------------------------------------------------");

        PastaDish panneAlfredo = new PanneAlfredo();
        panneAlfredo.makeRecipe();
        System.out.println(panneAlfredo);

    }

}
