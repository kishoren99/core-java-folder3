class Whereismytrain1
{
void train()
{
System.out.println("Check live status of train with name and number");
}
}
class Whereismytrain2 extends Whereismytrain1
{
void train()
{
super.train();
System.out.println("Now you can book train tickets along with live status of trian");
}
}
class Whereismytrain
{
public static void main(String[] args)
{
Whereismytrain2 w=new Whereismytrain2();
w.train();
}
}
