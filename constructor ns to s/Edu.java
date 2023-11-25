class Edu
{
String name;
String univ;
int cost;
Edu(String a, String b,int c)
{
name=a;
univ=b;
cost=c;
return;
}
public static void main(String[] args)
{
Edu e=new Edu("BE" ,"VTU",40000);
System.out.println(e.name);
System.out.println(e.univ);
System.out.println(e.cost);
}}