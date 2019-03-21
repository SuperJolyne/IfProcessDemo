package pojo;

public class Student extends People{

    public Student(){

    }

    public Student(String name,int age, int id){
        this.setId(id);
        this.setAge(age);
        this.setName(name);
    }
}
