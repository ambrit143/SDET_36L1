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

      Reporter.log("i am Executing the Test2",true);
      }
      public void display3() {

          Reporter.log("i am doing pull ",true);
          }

}
