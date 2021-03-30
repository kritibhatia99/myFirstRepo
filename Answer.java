interface MyIn
{
void sub (int a, int b);
}

class Negative implements MyIn
{
@Override
public void sub(int a, int b)
{
int c=a-b;
System.out.println("Actual value: " + c);
}
}

class Positive implements MyIn
{
@Override
public void sub(int a, int b)
{
int c=a-b;
System.out.println("Absolute value: " + Math.abs(c));
}
}

class Answer
{
public static void main(String[] args)
{ 
MyIn m1=new Negative();
MyIn m2=new Positive();
m1.sub(3,5); m2.sub(3,5);
}
}