package behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令的调用者
 */
public class Invoker {

    private final List<Command> list = new ArrayList<>();

    public void addCommand(Command command) {
        list.add(command);
    }

    public void removeCommand(Command command) {
        list.remove(command);
    }

    public void execute() {
        // lambda can be replaced with method reference
        list.forEach(Command::execute);
    }
}
