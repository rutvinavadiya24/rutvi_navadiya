package neha;
import java.util.*;
public class E_salary 
{	
	Scanner sc = new Scanner(System.in);
	E_details e=new E_details();
	int salary;
	public E_salary()
	{	
		System.out.println("-----------------------------");
		System.out.println("Calculate Net Salary:");
		System.out.print("Enter salary: ");
        salary=sc.nextInt();
        if(salary<10000)
        {	
        int tax=(salary*0)/100;
        	int ta=5;
    		int da=2;
    		int gross=salary-tax;
    		int net=salary-tax+ta+da;
    		System.out.println("tax(0%): "+tax);
    		System.out.println("Travel Allowence(5%): "+(gross+ta));
    		System.out.println("Dearness Allowence(2%): "+(gross+ta+da));
        	System.out.println("Net salary: "+net);
        }
        else if(salary>10000 && salary <=30000)
        {	int tax=(salary*2)/100;
        	int ta=5;
    		int da=2;
    		int gross=salary-tax;
    		int net=salary-tax+ta+da;
    		System.out.println("tax(2%):"+tax);
    		System.out.println("Travel Allowence(5%):"+(gross+ta));
    		System.out.println("Dearness Allowence(2%):"+(gross+ta+da));
        	System.out.println("Net salary: "+net);
        }
        else if(salary>31000 && salary <=50000)
        {	int tax=(salary*4)/100;
        	int ta=5;
    		int da=2;
    		int gross=salary-tax;
    		int net=salary-tax+ta+da;
    		System.out.println("tax(4%): "+tax);
    		System.out.println("Travel Allowence(5%): "+(gross+ta));
    		System.out.println("Dearness Allowence(2%): "+(gross+ta+da));
        	System.out.println("Net salary: "+net);
        }
        else
        {	int tax=(salary*6)/100;
        	int ta=5;
    		int da=2;
    		int gross=salary-tax;
    		int net=salary-tax+ta+da;
    		System.out.println("tax(6%): "+tax);
    		System.out.println("Travel Allowence(5%): "+(gross+ta));
    		System.out.println("Dearness Allowence(2%): "+(gross+ta+da));
        	System.out.println("Net salary: "+net);
        }
	}
}