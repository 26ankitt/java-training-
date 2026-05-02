import java.util.*;

class TravelAgencies{
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility; 
    }

    public int getregNo() {
        return regNo;
    }
    public void setregNo(int regNo) {
        this.regNo = regNo;
    }

    public String getpackageType() {
        return packageType;
    }
    public void setpackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getprice() {
        return price;
    }
    public void setprice(int price) {
        this.price = price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }
    public String getAgencyName() {
        return agencyName;
    }
    public void setagencyName() {
        this.agencyName = agencyName;
    }
    
    
}
public class OOPSq1 {
    static int findAgencyWithHighestPackage(TravelAgencies[]arr){
        for(int TravelAgencies agency : arr){
            int max = 0;
            if(agency.price() > max){
                max = agency.gePrice();
            }
        }
        return max;
    }
    static TravelAgencies agencyDetailsforGivenIdAndType(TravelAgencies[] arr, int regNo, String packageType){
        for(TravelAgencies agency : arr){
            if(agency.isFlightFacility() && agency.getregNo()==regNo &&agency.getpackageType().equalsIgnoreCase(packageType)){
                return agency;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TravelAgencies[]arr = new TravelAgencies[n];
        for(int i=0 ; i<n ; i++){
            int regNo = sc.nextInt();
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int price = sc.nextInt();
            boolean fl = sc.nextBoolean();

            TravelAgencies t = new TravelAgencies(regNo, agencyName,packageType,price,fl);
            arr[i] = t;
        }
        sc.nextLine();
        System.out.println();
        int regNo = sc.nextInt();
        String packageType = sc.nextLine();
        System.out.println("-------------------------------\nOutput\n-------------------------------");

        int highestprice = findAgencyWithHighestPackagePrice(arr);
        TravelAgencies agency = agencyDetailsforGivenIdAndType(arr,regNo,packageType);

        System.out.println(highestprice);
        if(agency!=null){
            System.out.println(agency.getAgencyName()+":"+agency.getPrice());
        }
    }
}
