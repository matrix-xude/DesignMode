package behavior.visitor;

/**
 * 医生访问者
 * 医生对老师学生体检，只需要知道他们的 姓名、年龄
 */
public class DoctorVisitor implements Visitor{

    @Override
    public void visitStudent(StudentElement student) {
        System.out.printf("医生体检了该学生(姓名：%s, 年龄：%d)\r\n",student.getName(), student.getAge());
    }

    @Override
    public void visitTeacher(TeacherElement teacher) {
        System.out.printf("医生体检一位教师(姓名：%s, 年龄：%d)\r\n",teacher.getName(), teacher.getAge());
    }
}
