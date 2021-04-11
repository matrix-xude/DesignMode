package behavior.state;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        context.click();
        context.click();
        context.click();

        List list = new ArrayList<String>();
        list.iterator();
    }
}
