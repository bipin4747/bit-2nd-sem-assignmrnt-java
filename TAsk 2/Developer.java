class Developer extends Employee implements TaxPayer {
    private String language;

    public Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println(name + " is writing code in " + language + ".");
    }

    @Override
    public double calculateTax() {
        return salary * 0.20;
    }

    public void writeCode() {
        System.out.println(name + " is developing software.");
    }
}
