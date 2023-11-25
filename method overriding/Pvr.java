class Pvr1
{
void book()
{
System.out.println("Book for tickets");
}
}
class Pvr2 extends Pvr1
{
void book()
{
System.out.println("Book tickets along with snacks");
super.book();
}
}
class Pvr
{
public static void main(String[] args)
{
Pvr2 p=new Pvr2();
p.book();
}
}