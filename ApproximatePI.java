//Name: Rithvik Padigala
//Period: 4A
import java.util.*;
public class ApproximatePI
{
    public static void main(String[] args)
    {
        Statically obj1 = new Statically(12);
        Statically obj2 = new Statically(obj1.getY());
        Statically obj3 = new Statically(Statically.getX());        
        System.out.println(obj1.getY() + obj2.getY() + "" +  obj3.getY() + Statically.getX());
    }
}