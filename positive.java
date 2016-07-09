import java.io.*;
import java.util.*;
import java.lang.*;
public class Positive
{
public static void main(String[] args)
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("the number is");
a=sc.nextInt();
if(a==0)
{
System.out.println("a is zero");
}
if(a>0)
{
System.out.println("a is positive");
}
else if(a<0)
{
System.out.println("a is negative");
}
}
}
