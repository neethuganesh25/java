import java.util.Scanner;
import java.util.Arrays;
class Employee1
{
    int eno,esalary;
    String ename;
    public Employee1()
    {
        
    }
    
    public Employee1(int no,int salary,String name)
    {
        eno=no;
        esalary=salary;
        ename=name;
       
    }
    public void showData()
    {
        
        System.out.println("empid="+eno);
        System.out.println("name="+ename);
        System.out.println("salary="+esalary);
        
    }
    }
    public class Employee
    {
        public static void main(String args[])
        {
            System.out.println("enter no employee");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("enter employee details one by one");
            Employee1 employees[]=new Employee1[n];
            Scanner sc_emp=new Scanner(System.in);
            int eid,esalary;
            String ename;
            for(int i=0;i<n;i++)
            {
                System.out.println("enter"+i+"employee details");
                System.out.println("enter employee id(integer)");
                eid=sc_emp.nextInt();
                System.out.println("enter employee name(string)");
                String name=sc_emp.next();
                ename=new String(name);
                System.out.println("enter employee salary(integer)");
                esalary=sc_emp.nextInt();
                Employee1 emp=new Employee1(eid,esalary,ename);
                employees[i]=emp;
            }
            System.out.println("employee are");
            for(Employee1 y:employees)
            y.showData();
            System.out.println("enter employee number to search");
            int semp=sc.nextInt();
            boolean found=false;
for(Employee1 e:employees)
{
if(semp==e.eno)
{
found=true;
System.out.println("employee found");
e.showData();
break;
}
}
if(!found)
{
System.out.println("employee not found");
}
}
}

                
                