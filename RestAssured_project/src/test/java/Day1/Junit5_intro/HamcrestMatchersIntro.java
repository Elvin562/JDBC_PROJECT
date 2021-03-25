package Day1.Junit5_intro;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchersIntro {

    @Test
    public void simpleTest1(){

        //assert 10 equal to 5+5
        //this is the syntax for hamcrest way of assertion
        //assetThat(some value,some matcher that describe what you aretrying to do)
        assertThat(5+5, is(10));
        assertThat(6+4,equalTo(10));

        //negative assertion 5+4 is not 11
        assertThat(5+5, not(11) );



    }




}
