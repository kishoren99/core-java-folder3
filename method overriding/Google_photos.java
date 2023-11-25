class Google_photos1
{
void upload()
{
System.out.println("only uploaded photos");
}
}
class Google_photos2 extends Google_photos1
{
void upload()
{
System.out.println("Google photos addedd new features-Spotlight");
super.upload();
}
}
class Google_photos
{
public static void main(String[] args)
{
Google_photos2 g=new Google_photos2();
g.upload();
}
}