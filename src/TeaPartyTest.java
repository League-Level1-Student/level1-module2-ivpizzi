import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaPartyTest {
       /**
        * Jane Robinson is a woman, so say “Hello Mrs. Robinson”. 
        * George Orwell is a man, so say “Hello Mr. Orwell”. 
        * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
        **/

       @Test
       public void test() {
               TeaParty teaParty = new TeaParty();
               String greeting = teaParty.welcome(null, false, false);
               assertEquals("Hello Mrs. Robinson", teaParty.welcome("Robinson", true, false));
               assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
               assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
       }
}