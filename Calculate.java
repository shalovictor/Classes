import java.io.*;
public class Calculate
{
int m,n,s,d;
public void inputdata() throws IOException
{
InputStreamReader read= new InputStraemReader(Syatem.in);
BufferedReader in = new BufferedReader(read);
System.out.println("Enter your first number");
m=Integer.parseInt(in.readLine());
System.out.println("Enter your second number");
n=Integer.parseInt(in.readLine());
}
public void calculation()
{
s=m+n;
d=m-n;
}
public void outputdata()
{
System.out.println("The sum of two numbers is "+s);
System.out.println(" The difference of two numbers is "+d);
}
public static void main(String args[]) throws IOException
{
Calculate ob= new Calculate();
ob.inputdata();
ob.calculation();
ob.output();
}
}
