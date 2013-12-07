import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MatchersTest {
    @Test
    public void canMatchAType() {
        assertThat(new SimpleType(), is(instanceOf(Type.class)));
    }
}

interface Type {}
class SimpleType implements Type {}