package behavior.visitor;

/**
 * 学生元素
 * 学生有姓名、年龄、成绩
 */
public class StudentElement implements Element{

    private String name;
    private int age;
    private int score;

    public StudentElement(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    @Override
    public void accept(Visitor visitor) {
        // 自己是学生，那么调用visitor的访问学生方法，把自己传过去
        visitor.visitStudent(this);
    }
}
