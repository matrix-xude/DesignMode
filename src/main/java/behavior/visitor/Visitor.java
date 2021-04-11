package behavior.visitor;

/**
 * 访问者
 * 想对学生、老师这两种元素进行访问
 */
public interface Visitor {

    // 访问学生
    void visitStudent(StudentElement student);

    // 访问老师
    void visitTeacher(TeacherElement teacher);
}
