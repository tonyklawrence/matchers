import org.junit.Test;
import types.ComplexType;
import types.ContainerType;
import types.SimpleType;
import types.Type;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ContainsTest {
    @Test
    public void isCorrectType() {
        assertThat(new ContainerType(), is(instanceOf(Type.class)));
        assertThat(new ContainerType(), is(instanceOf(ContainerType.class)));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void canContainTypes() {
        assertThat(new ContainerType(new SimpleType()), contains(instanceOf(SimpleType.class)));
        assertThat(new ContainerType(new SimpleType(), new ComplexType(50)), contains(instanceOf(SimpleType.class), instanceOf(ComplexType.class)));
    }
}