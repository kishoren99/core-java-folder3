class jiomart1
{
void or()
{
System.out.println("order only groceries");
}
}
class jiomart2 extends jiomart1
{
void or()
{
System.out.println("order groceris with cloths");
super.or();
}
}
class jiomart3 extends jiomart2
{
void or()
{
System.out.println("order groceries, cloths and Electronics");
}
}
class Reliance
{
public static void main(String[] args)
{
jiomart3 j= new jiomart3();
j.or();
}
}