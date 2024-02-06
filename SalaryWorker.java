public class SalaryWorker extends Worker{
    public double annualSalary;

    public SalaryWorker(String id, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(id, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "SalaryWorker{" + super.toString()+
                "annualSalary=" + annualSalary +
                '}';
    }


    @Override
    public double calculateWeeklyPay(double hoursWorked){
        double salariedWeeklyPay=annualSalary/52;
        return salariedWeeklyPay;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked){
        double salary=annualSalary;
        double salariedWeeklyPay=calculateWeeklyPay(hoursWorked);
        String salaryBreakdown="Salaried pay for 1 week with an annual salary of $" + annualSalary + " is equal to $"+salariedWeeklyPay;
        return salaryBreakdown;
    }


}
