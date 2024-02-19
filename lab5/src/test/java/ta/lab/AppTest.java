package ta.lab;


import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AppTest 
{
    @DataProvider()
    public Object[][] renumerationData() {
        return new Object[][] {
            {4000, 1000, 1000},
            {6000, 1000, 1120},
            {10000, 1000, 1600},
            {0, 1000, 1000},
            {5000, 1000,1000}
        };
    }

    @Test(dataProvider = "renumerationData")
    public void testCalculateRenumeration(double sales, double fixedSalary, double expected) {
        double actual = App.calculateRenumeration(sales, fixedSalary);
        assertEquals(actual, expected, 0.01, "Expected " + expected + " but got " + actual);
    }
}



// import org.testng.annotations.*;
// import static org.testng.Assert.*;


// public class AppTest 
// {
//     @Test
//     public void test(){
//         assertEquals(App.calculateRenumeration(6000, 1000), 1120);
//     }
//     @DataProvider()
//     public Object[][] testdata(){
//         return new Object[][]{
//             {4000, 1000, 1000},
//              {6000, 1000, 1120},
//              {10000, 1000, 1600},
//              {0, 1000, 1000},
//              {5000, 1000,1000}
//         };
//     }
    
// }
