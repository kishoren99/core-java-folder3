class Car
{
String name;
String type;
int cost;
Car(String x,String y,int z)
{
name=x;
type=y;
cost=z;
return;
}
public static void main(String[] args)
{
Car c=new Car("BMW", "Petrol engine", 200000000);
System.out.println(c.name);
System.out.println(c.type);
System.out.println(c.cost);
}}
