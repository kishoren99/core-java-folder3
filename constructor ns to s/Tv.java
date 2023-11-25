class Tv
{
String name;
String type;
double cost;
Tv(String a, String b, double c)
{
name=a;
type=b;
cost=c;
return;
}
public static void main(String[] args)
{
Tv t=new Tv("LG", "OLED 65 inch C2X", 250236);
System.out.println(t.name);
System.out.println(t.type);
System.out.println(t.cost);
}}