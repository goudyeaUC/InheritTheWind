import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
Worker testWorker = new Worker("000001","Mike","Nelson","Intern",1988,30.00);
    @org.junit.jupiter.api.Test
    void setHourlyPayRate() {
        testWorker.setHourlyPayRate(19.89);
        double testHourlyPayRate=19.89;
        double actualHourlyPayRate=testWorker.getHourlyPayRate();
        assertEquals(testHourlyPayRate, actualHourlyPayRate);
    }

    @org.junit.jupiter.api.Test
    void calculateWeeklyPay()
    {double hoursWorked=10;
     double   testWeeklyPay=300.00;
     double actualWeeklyPay=testWorker.calculateWeeklyPay(10);
     assertEquals(testWeeklyPay,actualWeeklyPay);
    }

    @org.junit.jupiter.api.Test
    void displayWeeklyPay() {
        double hoursWorked=10;
        String testDisplay="This person worked 10 regular hours, and 0 hours of overtime. The week's pay is $300.00.";
        String actualDisplay= testWorker.displayWeeklyPay(hoursWorked );
    }


}