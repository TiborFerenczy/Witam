/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import com.sun.net.httpserver.Authenticator;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class SpringesyTest {

    public SpringesyTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of justDoIt method, of class Springesy.
     */
    @Test
    public void testJustDoIt() {
      
        System.out.println("justDoIt");

        Springesy instance = new Springesy();
        System.out.println(instance.justDoIt(25));
        assertEquals(50, instance.justDoIt(25));
        
        //sd
        // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
       
    }
}
