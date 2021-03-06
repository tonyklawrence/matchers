package types;

public class SimpleType implements Type {
    public static Type simple() {
        return new SimpleType();
    }

    private SimpleType() { }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof SimpleType;
    }

    @Override
    public String toString() {
        return "simple()";
    }
}