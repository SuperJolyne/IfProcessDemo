import pojo.CustomObject;
import pojo.Student;
import processStart.Student_Processor;

public class Main_test {
    public static void main(String[] args) {
        Student s = new Student("sss",18,007);
        CustomObject sc = new CustomObject();
        sc.setStudent(s);
        Student_Processor sp = new Student_Processor();
        sp.afterPropertiesSet();
        sp.process(sc);
    }
}
