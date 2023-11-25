class Cloth
{
String color;
char size;
int cost;
Cloth(String a, char b, int c)
{
color=a;
cost=c;
size=b;
return;
}
public static void main(String[] args)
{
Cloth c=new Cloth("White",'S',1502);
System.out.println(c.color);
System.out.println(c.size);
System.out.println(c.cost);
}}