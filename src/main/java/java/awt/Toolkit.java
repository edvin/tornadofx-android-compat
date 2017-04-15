package java.awt;

public class Toolkit {
    public static synchronized Toolkit getDefaultToolkit() {
        return new Toolkit();
    }
}
