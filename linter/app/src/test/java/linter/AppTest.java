/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void noErrors() throws IOException {
        String path = "C:\\Users\\user\\LTUC\\java-fundamentals\\linter\\app\\src\\test\\resources\\noerror.js";
        assertEquals(0,App.readFile(path),"file with no error ");
    }
    @Test void oneError() throws IOException{
        String path="C:\\Users\\user\\LTUC\\java-fundamentals\\linter\\app\\src\\test\\resources\\oneError.js";
        assertEquals(1,App.readFile(path),"file that contains one error.");
    }
    @Test void fewErrors() throws IOException{
        String path="C:\\Users\\user\\LTUC\\java-fundamentals\\linter\\app\\src\\test\\resources\\fewErrors.js";
        assertEquals(3,App.readFile(path),"file that contains few error.");
    }
    @Test void manyErrors() throws IOException{
        String path="C:\\Users\\user\\LTUC\\java-fundamentals\\linter\\app\\src\\test\\resources\\manyErrors.js";
        assertEquals(7,App.readFile(path),"file that contains many error.");
    }
    @Test void emptyErrors() throws IOException{
        String path="C:\\Users\\user\\LTUC\\java-fundamentals\\linter\\app\\src\\test\\resources\\emptyErrors.js";
        assertEquals(0,App.readFile(path),"empty file that contains 0 error.");
    }
}