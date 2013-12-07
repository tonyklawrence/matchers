package types;

public class SimpleType implements Type {
    public static SimpleType simple() {
        return new SimpleType();
    }

    private SimpleType() { }
}