package JavaRush;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public  class TestTwho extends Test{

    public static void main(String[] args) {
TestTwho testTwho = new TestTwho();
testTwho.printAll();
Test test = new TestTwho();
test.printName();
testTwho.refresh();


    }

    public void refresh(){
        super.printName();
    }
    @Override
     public void printName(){
        System.out.println("Я тест № 2");
    }

}


//E://update//As.txt
//E://video//Ad.txt



