import java.util.*;

class Addition
{
public static void main(String[] arg)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
a=sc.nextInt();
System.out.println("Enter second number");
b=sc.nextInt();
c=addition(a,b);
System.out.println("Sum of two numbers is : "+c);
}

static int addition(int x,int y)
{
	return x+y;
}
}