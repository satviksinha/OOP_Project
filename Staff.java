import java.util.*;

public class Staff {
    private BoardingPass boardingPass;
    private String Name;
    private String AadhaarNo;
    private String Gender;
    private int Age;
    //private Customer cust;

    public boolean VerifyDetails() {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter your name: ");
        this.Name = sc.nextLine();
        System.out.println("Enter your Aadhar number: ");
        this.AadhaarNo = sc.nextLine();
        System.out.println("Enter your age: ");
        this.Age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter your gender: ");
        this.Gender = sc.nextLine();
        for (int g = 0; g < FlightFinder.Customers.size(); g++) {
            if (this.Name == FlightFinder.Customers.get(g).getName()
                    && this.AadhaarNo == FlightFinder.Customers.get(g).getAadhaarNo()
                    && this.Gender == FlightFinder.Customers.get(g).getGender()) {
               // getCustomer(FlightFinder.Customers.get(g));
               //this.cust = FlightFinder.Customers.get(g);
                return true;
            }
        }
        return false;
    }

    // public Customer getCustomer(){
    //     return cust;
    // }
}
