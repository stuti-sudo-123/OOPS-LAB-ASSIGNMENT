abstract class BaseClass {
    void debug() {
        System.out.println("Debugging started...");
    }

    void log(String message) {
        System.out.println("LOG: " + message);
    }
    abstract void execute();
}
class ModuleA extends BaseClass {

    void execute() {
        debug();
        log("Executing Module A");
        System.out.println("Module A running...");
    }
}
class ModuleB extends BaseClass {

    void execute() {
        debug();
        log("Executing Module B");
        System.out.println("Module B running...");
    }
}
public class ProjectTest {
    public static void main(String[] args) {

        BaseClass obj1 = new ModuleA();
        BaseClass obj2 = new ModuleB();

        obj1.execute();
        System.out.println();

        obj2.execute();
    }
}
