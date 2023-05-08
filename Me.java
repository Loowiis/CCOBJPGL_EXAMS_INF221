public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Bohol bohol) {

        //Gastos
        budget -= bohol.airFare;

        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Went to Bohol: ");
        System.out.println("Gusto ko na makita ang Chocolate Hills");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(California california) {

        //Gastos
        budget -= california.airFare;

        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Went to California: ");
        System.out.println("Gusto ko na makita si Stephen Curry at Jordan Poole");
        checkBudget();
        System.out.println("-------------------------------------------");
    }
    
    public void visit(Boracay boracay) {

        //Gastos
        budget -= boracay.airFare;
        
        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Went to Boracay: ");
        System.out.println("Gusto ko na makita yung magandang sunset");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Japan japan) {

        //Gastos
        budget -= japan.airFare;

        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Went to Japan: ");
        System.out.println("Gutom na ako gusto ko ramen");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Maldives maldives) {

        //Gastos
        budget -= maldives.airFare;

        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Went to Maldives: ");
        System.out.println("Gusto ko na magbabad sa crystal clear na dagat");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Paris paris) {

        //Gastos
        budget -= paris.airFare;

        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Went to Paris: ");
        System.out.println("Eiffel Tower ang main attraction ");
        checkBudget();
        System.out.println("Wala na finish na back to ipon na ulet");
        System.out.println("-------------------------------------------");

    }

    public void checkBudget() {

        System.out.println("my budget is " + budget);
    }

}