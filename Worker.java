public class Worker extends Person {
    public double hourlyPayRate;

    public Worker(String id, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(id, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay (double hoursWorked){
        double weeklyPay;
        double hoursOvertime;
        double overtimeThreshold=40.0;
        if (hoursWorked <= overtimeThreshold)
        {weeklyPay=hoursWorked*hourlyPayRate;}
        else{hoursOvertime=hoursWorked-overtimeThreshold;
        weeklyPay=(40.0*hourlyPayRate)+(1.5*hourlyPayRate*hoursOvertime);}
        return weeklyPay;
    }
    public String displayWeeklyPay (double hoursWorked){
        String weeklyPayBreakdown;
        double weeklyPayAmount=calculateWeeklyPay(hoursWorked);
        double regularHours;
        double overtimeHours;
        if (hoursWorked <= 40)
        {overtimeHours=0;
        regularHours=hoursWorked;}
        else {overtimeHours=hoursWorked-40;
        regularHours=40;}
        weeklyPayBreakdown="This person worked " + regularHours + " regular hours, and " + overtimeHours + "of overtime. "+"The week's pay is $" + weeklyPayAmount;

        return weeklyPayBreakdown;
    }

    @Override
    public String toString() {
        return "Worker{" +super.toString()+
                "hourlyPayRate=" + hourlyPayRate +
                '}';
    }


}