package processList;

import pojo.AbstractProcess;
import pojo.CustomObject;

public class P_NameProcessor extends AbstractProcess {
    protected void doProcess(CustomObject context) {
        System.out.println(context.getStudent().getName());
    }
}
