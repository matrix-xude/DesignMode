package behavior.visitor;


public class Client {

    public static void main(String[] args) {
        // 初始化数据
        School school = new School();
        school.add(new StudentElement("Jack", 21, 342));
        school.add(new StudentElement("小明", 13, 140));
        school.add(new StudentElement("翠花", 16, 89));
        school.add(new TeacherElement("伍连德", 38, 8888));
        school.add(new StudentElement("李斯特", 19, 534));
        school.add(new StudentElement("爱因斯坦", 17, 888));
        school.add(new TeacherElement("麦克斯韦", 65, 28888));

        // 不同的访问者
        Visitor visitor1 = new DoctorVisitor();
        Visitor visitor2 = new PrincipalVisitor();

        // 开始访问
        school.visit(visitor1);
        school.visit(visitor2);
    }
}
