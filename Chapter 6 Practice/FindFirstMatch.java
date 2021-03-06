
public class FindFirstMatch
{
    //returns position of the first space in the specified string or -1 if the string has no spaces
    public static int findFirstMatch( String str )
    {
        boolean found = false;
        int position = 0;
        
        while( !found && position < str.length())
        {
            char ch = str.charAt( position );
            if(ch == ' ')
            {
                found = true;
            }
            else
            {
                position++;
            }
        }
        
        if (found)
        {
            return position;
        }
        else
        {
            return -1;
        }
    }

}
