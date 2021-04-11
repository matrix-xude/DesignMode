package behavior.visitor;

/**
 * 老师元素
 * 老师有姓名、年龄、工资
 */
public class TeacherElement implements Element {

    private String name;
    private int age;
    private int salary;

    public TeacherElement(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void accept(Visitor visitor) {
        // 自己是老师，那么调用visitor的访问老师方法，把自己传过去
        visitor.visitTeacher(this);
    }
}
