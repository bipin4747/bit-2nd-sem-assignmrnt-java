class Manager extends Employee implements TaxPayer {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(name + " is managing a team of " + teamSize + " people.");
    }

    @Override
    public double calculateTax() {
        return salary * 0.25;
    }

    public void approveBudget() {
        System.out.println(name + " approved the project budget.");
    }
}