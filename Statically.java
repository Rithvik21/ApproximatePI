public class Statically {

    private static int x;
    private int y;
    
    public Statically(int a)
    {
        y = a + x;
        if(a % 3 == 0)
        {
            x += 3;
        }
        else
        {
            x+=y;
        }
    }
    
    public static int getX()
    {        
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
}