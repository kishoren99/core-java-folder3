class Sample
{
int c=9;
}
class Demo extends Sample
{
void test()
{
System.out.println("Hi i am the Demo");
}
}
class Mainclass
{
public static void main(String[] args)
{
Demo d1=new Demo();
System.out.println(d1.c);
d1.test();

}
}