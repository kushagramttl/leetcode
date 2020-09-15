public class Prob7{
    public int Reverse(int x) {
        try
        {
            
            long reverse = 0;
            while(x!=0)
            {
                reverse = (reverse * 10) + (x%10);
                
                if(reverse < Int32.MinValue || reverse > Int32.MaxValue)
                {
                    return 0;
                }
                
                x = x/10;
            }
            
            return (int)reverse;
        }
        catch
        {
            return 0;
        }
    }
}