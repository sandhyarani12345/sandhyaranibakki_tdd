import java.util.*;
class tdd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter string ");
String s=sc.next();
char f=s.charAt(0);
char sec=s.charAt(1);
if(f=='A' && sec=='A')
s=s;
if((f=='A'|| sec=='A') || (f=='A' && sec=='A))
{
s=s.replace("A","");
}
else
s=s;
System.out.println(s);
}
}
