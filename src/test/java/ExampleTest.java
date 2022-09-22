import static org.easymock.EasyMock.*;

import org.junit.*;


public class ExampleTest {

    //1 - Instance class to mock
    private Collaborator mock;

    @Before
    public void setUp() {
        //2 - Initiate The mock
        mock = mock(Collaborator.class);
    }

    @Test
    public void testReturnText() {
        //Set expected object
        String expected = "b";

        //3 - Set desired return on method call from mock
        expect(mock.returnText("a")).andStubReturn("b");

        //4 - Call replay to record the return
        replay(mock);

        //5 - Call the method OBS: This parameter and the one in step 3, must be the same
        String actual = mock.returnText("a");

        //Asserting the return
        Assert.assertEquals(expected, actual);
    }
}