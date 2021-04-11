package behavior.interpreter;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        String info = "1+7+5-3+1";
        int calculate = context.calculate(info);
        System.out.println(info + "=" + calculate);
    }
}
