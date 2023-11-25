class Mobile
{
String mobile_name;
String mobile_color;
double mobile_cost;
Mobile (String a, String b, double c)
{
mobile_name=a;
mobile_color=b;
mobile_cost=c;
return;
}
public static void main(String[] args)
{
Mobile m=new Mobile("iphone", "white", 83434);
System.out.println(m.mobile_name);
System.out.println(m.mobile_color);
System.out.println(m.mobile_cost);
}
}