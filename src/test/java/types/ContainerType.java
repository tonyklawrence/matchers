package types;

import com.googlecode.totallylazy.Sequence;

import java.util.Iterator;

import static com.googlecode.totallylazy.Sequences.sequence;

public class ContainerType implements Type, Iterable<Type> {
    private final Sequence<Type> types;

    private ContainerType(Type... types) {
        this.types = sequence(types);
    }

    public static ContainerType container(Type... types) {
        return new ContainerType(types);
    }

    @Override
    public Iterator<Type> iterator() {
        return types.iterator();
    }

    @Override
    public int hashCode() {
        return types.hashCode();
    }

    @Override
    @SuppressWarnings("SimplifiableIfStatement")
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return types.equals(((ContainerType) o).types);
    }

    @Override
    public String toString() {
        return "container(" + types + ")";
    }
}