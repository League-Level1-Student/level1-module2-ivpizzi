
public class TeaParty
{
	public String welcome(String name, boolean isWoman, boolean isKnighted)
    {
		if(isWoman)
		{
			return "Hello Mrs. " + name;
		}
		if(isWoman == false && isKnighted == false)
		{
			return "Hello Mr. " + name;
		}
		if(isKnighted && isWoman == false)
		{
			return "Hello Sir " + name;
		}
		else
		{
			return "error";
		}
    }

}
