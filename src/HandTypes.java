import java.util.HashMap;
import java.util.Map;

public class HandTypes {
    public final Map<String, int[]> chipsAndMult = new HashMap<>();

    public HandTypes(Map<String, int[]> chipsAndMult) {
        this.chipsAndMult.put("High Card",new int[] {5,1});
    }

}
