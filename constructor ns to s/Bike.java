class Bike
{
String name;
String color;
double cost;
Bike(String x, String y, double z)
{
name=x;
color=y;
cost=z;
return;
}
public static void main(String[] args)
{
Bike b=new Bike("Hero xpulse", "White and red", 200000);
System.out.println(b.name);
System.out.println(b.color);
System.out.println(b.cost);
}}