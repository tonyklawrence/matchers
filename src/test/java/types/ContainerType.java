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
}