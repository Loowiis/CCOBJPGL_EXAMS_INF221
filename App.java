public class App {
    public static void main(String[] args) throws Exception {

        Locations bohol = new Bohol();
        Locations california = new California();
        Locations boracay = new Boracay();
        Locations japan = new Japan();
        Locations maldives = new Maldives();
        Locations paris = new Paris();
        
        Tourist me = new Me();

        bohol.accept(me);
        california.accept(me);
        boracay.accept(me);
        japan.accept(me);
        maldives.accept(me);
        paris.accept(me);


        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

    }
}