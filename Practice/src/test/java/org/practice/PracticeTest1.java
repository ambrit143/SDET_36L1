package org.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeTest1 {
      @Test
      public void display() {

      Reporter.log("Executing the Test1",true);
      }
      @Test
      public void display2() {
//Testing
      Reporter.log("Executing the Test2",true);
      }

}
