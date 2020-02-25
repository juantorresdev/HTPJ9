package mx.com.htpj9;

public class BasePlusCommissionEmployeeInheritance extends CommissionEmployee{

    private double baseSalary;

    public BasePlusCommissionEmployeeInheritance(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        this.setBaseSalary(baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0.0)
            this.baseSalary = baseSalary;
        else
            throw new IllegalArgumentException("Base salary must be >= 0.0");
    }

    @Override
    public double earnings() {
        return this.baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return String.format(
                "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "base-salaried commission employee", this.getFirstName(), this.getLastName(),
                "social security number", this.getSocialSecurityNumber(),
                "gross sales", this.getGrossSales(), "commission rate", this.getCommissionRate(),
                "base salary", baseSalary );
        }

}
