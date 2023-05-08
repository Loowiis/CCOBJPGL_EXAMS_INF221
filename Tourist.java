interface Tourist {

    int budget = 0;

    void visit();

    void visit(Bohol bohol);

    void visit(California california);

    void visit(Boracay boracay);

    void visit(Japan japan);

    void visit(Maldives maldives);

    void visit(Paris paris);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}

