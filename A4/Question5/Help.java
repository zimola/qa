import java.util.HashMap;
import java.util.Map;

public class Help
{
	
	private Map<String, Command> hm = new HashMap<String, Command>();
	
	public Help(){
		hm.put("print", new Print());
		hm.put("open", new Open());
		hm.put("close", new Close());
	}
	
	public String GetHelp(String command)
	{
		if (command != null && command.length() != 0)
		{
			return hm.get(command).GetHelp();
		}
		return ListAllCommands();
	}

	public String ListAllCommands()
	{
		return "Commands: print, open, close";
	}
}