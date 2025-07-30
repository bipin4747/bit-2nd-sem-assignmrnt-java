// File: Intern.java

class Intern extends Employee implements TaxPayer {
    private String school;

    public Intern(String name, int id, double salary, String school) {
        super(name, id, salary);
        this.school = school;
    }

    @Override
    public void work() {
        System.out.println(name + " is assisting with tasks from " + school + ".");
    }

    @Override
    public double calculateTax() {
        return salary * 0.10;
    }

    public void attendTraining() {
        System.out.println(name + " is attending training sessions.");
    }
}

