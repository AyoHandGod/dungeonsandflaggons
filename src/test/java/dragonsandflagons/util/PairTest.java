package dragonsandflagons.util;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PairTest {

  Pair<String, Integer> pair;

  @BeforeClass
  public void beforeClass() {
    pair = new Pair<String, Integer>("TestString", 4);
  }

  @Test
  public void getLeft() {
    String leftString = pair.getLeft();
    Assert.assertEquals("TestString", leftString);
  }
}
