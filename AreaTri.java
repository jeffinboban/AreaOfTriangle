import java.util.Scanner;
class AreaTri
{
public static void main(String args[])
{
Scanner r= new Scanner(System.in);
System.out.println("Enter the base");
float base=r.nextFloat();
System.out.println("Enter the height");
int height=r.nextInt();
float area=(base*height)/2;
System.out.println("Area of a triangle with base "+base+" and height "+height+" is "+area);
}
}
