package types;

public class ComplexType implements Type {
    private final int value;

    private ComplexType(int value) {
        this.value = value;
    }

    public static ComplexType complex(int value) {
        return new ComplexType(value);
    }
}