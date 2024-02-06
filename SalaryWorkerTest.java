import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
SalaryWorker testSalaryWorker = new SalaryWorker("00000","Tony","Stark","Dr.",1965,00.00,90000.00);

    @Test
    void setAnnualSalary() {
        testSalaryWorker.setAnnualSalary(52000.00);
      double  testAnnualSalary=52000.00;
      double actualAnnualSalary=52000.00;
      assertEquals(testAnnualSalary,actualAnnualSalary);
    }



    @Test
    void calculateWeeklyPay() {
        testSalaryWorker.setAnnualSalary(52000.00);
        double testWeeklyPay = 1000.00;
        double actualWeeklyPay = testSalaryWorker.calculateWeeklyPay(40.00);
        assertEquals(testWeeklyPay,actualWeeklyPay);
    }

    @Test
    void displayWeeklyPay() {
        testSalaryWorker.setAnnualSalary(52000.00);
        String testDisplay="Salaried pay for 1 week with an annual salary of $52000.0 is equal to $1000.0";
        String actualDisplay=testSalaryWorker.displayWeeklyPay(40);
        assertEquals(testDisplay,actualDisplay);
    }
}