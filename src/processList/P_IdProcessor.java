package processList;

import pojo.AbstractProcess;
import pojo.CustomObject;

public class P_IdProcessor extends AbstractProcess {
    protected void doProcess(CustomObject context) {
        System.out.println(context.getStudent().getId());
    }
}
