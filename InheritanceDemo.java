import java.util.Objects;
import java.io.BufferedOutputStream;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;
import java.util.ArrayList;
public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Person> employees=new ArrayList<Person>();
employees.add (new Worker("000001","Jim","Hopper","Officer",1985,30.08 ));
employees.add (new Worker("000002", "Jesse","Pinkman","Mr.",1993,20.19));
employees.add (new Worker("0000003","Mike","Nelson","Mr.",1983,30.00));
employees.add (new SalaryWorker("000004","Reed","Richards","Dr.",1987,00.00,96000.00));
employees.add (new SalaryWorker("000005","Barry","Allen","Detective",1989,00.00,52000.00));
employees.add (new SalaryWorker("000006","William","Fowler","Agent",1985,00.00,2025.86));
String currentWorkerName;
double currentPersonPay = 0;
int weekNumber=0;
double hoursWorked = 0;
while (weekNumber <=2) {
if (weekNumber==0){hoursWorked=40;}
if (weekNumber==1){hoursWorked=50;}
if (weekNumber==2){hoursWorked=40;}
    for (Person person : employees) {
        currentWorkerName = person.getFullName();
        if (person instanceof Worker)
        {
            currentPersonPay = ((Worker) person).calculateWeeklyPay(hoursWorked);
        }
        if(person instanceof SalaryWorker)
        {
            currentPersonPay = ((SalaryWorker) person).calculateWeeklyPay(hoursWorked);
        }

        System.out.println("Payslip for: " + currentWorkerName);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Weekly pay: $" + currentPersonPay);
        System.out.println();

    }
    weekNumber++;
}

}
}
