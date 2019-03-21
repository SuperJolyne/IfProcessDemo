package processList;

import pojo.AbstractProcess;
import pojo.CustomObject;

public class P_AgeProcessor extends AbstractProcess {
    protected void doProcess(CustomObject context) {
        System.out.println(context.getStudent().getAge());
    }
}
