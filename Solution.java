import java.util.*;

class TravelAgencies {
    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getPrice() {
        return price;
    }
}

public class Solution {

    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agencies) {
        int max = Integer.MIN_VALUE;

        for (TravelAgencies agency : agencies) {
            if (agency.getPrice() > max) {
                max = agency.getPrice();
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TravelAgencies[] arr = new TravelAgencies[n];

        for (int i = 0; i < n; i++) {
            int regNo = sc.nextInt();
            sc.nextLine(); // consume newline
            String name = sc.nextLine();
            String type = sc.nextLine();
            int price = sc.nextInt();
            boolean flight = sc.nextBoolean();

            arr[i] = new TravelAgencies(regNo, name, type, price, flight);
        }

        int result = findAgencyWithHighestPackagePrice(arr);

        if (result > 0) {
            System.out.println(result);
        } else {
            System.out.println("No Agency Found");
        }

        sc.close();
    }
}