import java.time.Duration;
import java.util.ArrayList;

public interface IDigitalItem {
	public boolean IsDigitalOnly();
	public Duration GetPlayTime();
	public ArrayList<String> GetCastList();


}
