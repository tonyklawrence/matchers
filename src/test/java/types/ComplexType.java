package types;

public class ComplexType implements Type {
    private final int value;

    private ComplexType(int value) {
        this.value = value;
    }

    public static Type complex(int value) {
        return new ComplexType(value);
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ComplexType && ((ComplexType) obj).value == value;
    }

    @Override
    public String toString() {
        return "complex(" + value + ")";
    }
}