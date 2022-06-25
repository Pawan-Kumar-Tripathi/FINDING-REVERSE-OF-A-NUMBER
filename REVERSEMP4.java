//PROGRAM TO REVERSE A NUMBER 
import java.util.*;
class REVERSEMP4
{
    public void main()
    {
        int num = 12345;
        int rev=0;
        
        for(;num!=0;)
        {
            rev = rev*10 + num%10;
            num= num/10;
        } 
        System.out.println(rev);
    }
}