package types;

import com.googlecode.totallylazy.Sequence;

import java.util.Iterator;

import static com.googlecode.totallylazy.Sequences.sequence;

public class ContainerType implements Type, Iterable<Type> {
    private final Sequence<Type> types;

    public ContainerType(Type... types) {
        this.types = sequence(types);
    }

    @Override
    public Iterator<Type> iterator() {
        return types.iterator();
    }
}