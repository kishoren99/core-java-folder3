class Rapido1
{
void ride()
{
System.out.println("Ride with bike");
}
}
class Rapido2 extends Rapido1
{
void ride()
{
System.out.println("Ride with bike and auto");
super.ride();
}
}
class Rapido3 extends Rapido2
{
void ride()
{
System.out.println("Ride with bike, auto and cabs");
super.ride();
}
}
class Rapido
{
public static void main(String[] args)
{
Rapido3 r=new Rapido3();
r.ride();
}
}