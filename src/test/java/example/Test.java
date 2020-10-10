package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

  @org.junit.Test
  public void test() {
    Logger logger = LoggerFactory.getLogger("example");
    logger.info("here");
  }

}
