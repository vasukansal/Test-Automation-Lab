package ta.lab;

public class App 
{

    public static double calculateRenumeration(double sales, double fixedSalary) {
        return sales > 5000 ? (sales-5000)*0.12 + fixedSalary : fixedSalary;
    }

    public static void main( String[] args )
    {
        System.out.println(App.calculateRenumeration(6000, 1000));
    }
}
