class cpu
{
double price;

class processor{
double core;
String manuf;
double getcache()
{
return 4.3;
}
}
protected class ram
{
double memory;
String manufa;
double clockspeed()
{
return 5.5;
}
}
}
public class cpudetails
{
public static void main(String args[])
{
cpu obj1=new cpu();
cpu.processor obj2=new obj1.new processor();
cpu.ram obj3=new obj1.new ram();
System.out.println("processor cache is"+obj2.getcache);
System.out.println("ram is"+obj3.clockspeed);
}
}







