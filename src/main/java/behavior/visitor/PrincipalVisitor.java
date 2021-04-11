package behavior.visitor;

/**
 * 校长访问者
 * 校长想知道学生的 姓名、成绩
 * 想知道老师的 姓名、工资
 */
public class PrincipalVisitor implements Visitor{
    @Override
    public void visitStudent(StudentElement student) {
        System.out.printf("校长查看了该学生成绩(姓名：%s, 成绩：%d)\r\n",student.getName(), student.getScore());
    }

    @Override
    public void visitTeacher(TeacherElement teacher) {
        System.out.printf("校长查看了该教师薪资(姓名：%s, 薪资：%d)\r\n",teacher.getName(), teacher.getSalary());
    }
}
