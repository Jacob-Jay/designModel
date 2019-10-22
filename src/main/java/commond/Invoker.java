package commond;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-10-22 17:56
 */
public class Invoker {

    private List<Commond> commonds = new ArrayList<Commond>();

    public void addCommond(Commond commond) {
        commonds.add(commond);
    }

    public void removeCommon(Commond commond) {
        commonds.remove(commond);
    }

    public void invoke() {
        for (Commond commond : commonds) {
            commond.execute();
        }
    }
}
