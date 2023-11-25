class Laptop
{
String name;
String brand;
double cost;
Laptop(String p, String q, double r)
{
name=p;
brand=q;
cost=r;
return;
}
public static void main(String[] args)
{
Laptop l=new Laptop("HP" , "i7", 80008.99);
System.out.println(l.name);
System.out.println(l.brand);
System.out.println(l.cost);
}}