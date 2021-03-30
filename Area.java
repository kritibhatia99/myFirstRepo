import java.util.*;

class Area
{
public static void main(String[] args)
{
int x, y, z;
try
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the dimensions to calculate the area:");
x=sc.nextInt();
y=sc.nextInt();
if (x<0||y<0)
{
throw new ArithmeticException();
}
z=x*y;
System.out.println("Area is: " + z + " sq. units");
}
catch (ArithmeticException e)
{
System.out.println("Dimensions cannot be in negative");
}
finally
{
System.out.println("Calculation complete");
}
}
}

  