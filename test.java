public class rectangle
{
int l,w;
void getvalue(int a,int b)
{
l=a;
w=b;
}
void calculate(){
System.out.println("l*w");
}
}
public class test
{
public static void main(String args[])
{
rectangle r1=new rectangle();
rectangle r2=new rectangle();
r1.getvalue(5,2);
r2.getvalue(4,5);
r1.calculate();
r2.calculate();
}
}
