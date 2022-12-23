import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class FunctionTest extends TestCase {

    Function function;

    @Before
    public void createObject(){
        function = new Function(10);
    }

    @Test
    public void functionResult() {
        Assert.assertEquals(97.48636634052538, Function.func(),0.5);
    }
}