package processStart;


import pojo.AbstractProcess;
import pojo.CustomObject;
import processAnnotation.ProAnnotation;
import processList.P_AgeProcessor;
import processList.P_IdProcessor;
import processList.P_NameProcessor;

import java.util.ArrayList;
import java.util.List;

@ProAnnotation(value = {
        P_AgeProcessor.class,
        P_NameProcessor.class,
        P_IdProcessor.class
})
public class Student_Processor {

    private List<AbstractProcess> processList = new ArrayList<AbstractProcess>();

    public void afterPropertiesSet() {
        ProAnnotation annotation = getClass().getAnnotation(ProAnnotation.class);
        if (annotation != null && annotation.value().length>0){
            for (Class c : annotation.value()){
                Class cc = null;
                try {

                    cc = Class.forName(c.getName());
                    AbstractProcess ap = (AbstractProcess) cc.newInstance();
                    processList.add(ap);

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }


            }
        }
    }

    public void process(CustomObject context){
        int i = 1;
        if (context == null){
            return;
        }
        for (AbstractProcess ap : processList){
            System.out.print("第"+i+"个判断逻辑实现：");
            ap.process(context);
            i++;
        }
        return;
    }
}
