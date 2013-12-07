import com.googlecode.totallylazy.Sequence;
import org.junit.Test;

import java.util.Iterator;

import static com.googlecode.totallylazy.Sequences.sequence;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ContainsTest {
    @Test
    public void isCorrectType() {
        assertThat(new ContainerType(), is(instanceOf(Type.class)));
        assertThat(new ContainerType(), is(instanceOf(ContainerType.class)));
    }

    @Test
    public void canContainTypes() {
        assertThat(new ContainerType(new SimpleType()), contains(instanceOf(SimpleType.class)));
        assertThat(new ContainerType(new SimpleType(), new ComplexType(50)), contains(instanceOf(SimpleType.class), instanceOf(ComplexType.class)));
    }
}

class ContainerType implements Type, Iterable<Type> {
    private final Sequence<Type> types;

    public ContainerType(Type... types) {
        this.types = sequence(types);
    }

    @Override
    public Iterator<Type> iterator() {
        return types.iterator();
    }
}

