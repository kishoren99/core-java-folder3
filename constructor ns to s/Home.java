class Home
{
String name;
String color;
String cost;
Home(String n,String c,String co)
{
name=n;
color=c;
cost=co;
return;
}
public static void main(String[] args)
{
Home h=new Home("Samruddhi Nivasa", "White and Brown", "2.5 crore ");
System.out.println(h.name);
System.out.println(h.color);
System.out.println(h.cost);
}}