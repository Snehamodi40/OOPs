import java.util.Scanner;
class Car{
String brand;
String color;
int speed;
void display()
{
System.out.println("car brand="+brand);
System.out.println("car color="+color);
System.out.println("car speed="+speed);
}
}
public class main1{
public static void main(String[] args)
{
Car c=new Car();
c.brand="toyota";
c.color="blue";
c.speed=120;
c.display();
}
}