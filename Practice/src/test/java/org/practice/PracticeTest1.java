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


      Reporter.log("i am Executing the Test2",true);

      }
    //Testing jenkin continous integration   
      public void display4() {

          Reporter.log("i am doing jenkin integration ",true);
          }
      public void display5() {

          Reporter.log("i am doing jenkin integration1 ",true);
          }

}
