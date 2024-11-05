import java.io.*;

class Main {

    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public void startHotelReservationSystem() throws IOException {

        String roomTypes[] = { "Single Occupancy", "Double Occupancy", "Tripple Occupancy", "Deluxe Room", "Super Deluxe", "King Size", "Cottage", "Tent" };
        double rents[] = { 1200, 2000, 3000, 5000, 6000, 7000, 8000, 2700 };
        int roomCount[] = { 5, 10, 8, 7, 7, 8, 10, 10 };

        while (true) {

            System.out.println("\f Welcome To ABC HOTEL ");
            System.out.println("======================================================================");
            System.out.println("Press                  Type                Available   Rent");

            for (int i = 0; i < roomTypes.length; i++) {
                int diff = 26 - roomTypes[i].length();
                for (int j = 1; j <= diff; j++)
                    roomTypes[i] += " ";
                System.out.println((i + 1) + "                  " + roomTypes[i] + roomCount[i] + "     Rs " + rents[i]);
            }

            System.out.println("Enter the Room Type: ");
            int option = Integer.parseInt(r.readLine());
            if (option > 0 && option <= 8) {
                if (roomCount[option - 1] == 0) {
                    System.out.println("Sorry, no such room is available now. Do you want to try with other rooms? Press Y for Yes and any other key to EXIT: ");
                    String choice = r.readLine();
                    if (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("Yes"))
                        continue;
                    else
                        break;
                } else {
                    roomCount[option - 1]--;
                    System.out.println("Please enter the name of the customer: ");
                    String name = r.readLine();
                    System.out.println("Please enter the phone of the customer: ");
                    long ph = Long.parseLong(r.readLine());
                    System.out.println("Please enter the number of Days of Booking: ");
                    int d = Integer.parseInt(r.readLine());
                    printBill(name, ph, roomTypes[option - 1], d, rents[option - 1]);
                    System.out.println("Do you want to continue to the next reservation? Y for YES, Any other character for EXIT : ");
                    String choice = r.readLine();
                    if (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("Yes"))
                        continue;
                    else
                        break;
                }
            } else {
                System.out.println("Entered the wrong choice. Do you want to continue with the correct choice? Press Y for YES, Any other character for Exiting : ");
                String choice = r.readLine();
                if (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("Yes"))
                    continue;
                else
                    break;
            }
        }
    }

    private void printBill(String name, long phone, String roomType, int d, double roomRent) {
        System.out.println("============================\n------------------------------------------------------------------");
        System.out.println("            ABC HOTEL");
        System.out.println("---------------------------------------------------------");
        System.out.println("            BILL NO :" + (int) (Math.random() * 100) + "7890" + (int) (Math.random() * 100));
        System.out.println("---------------------------------------------------------");
        System.out.println("      Name : " + name);
        System.out.println("      Phone : " + phone);
        System.out.println("      Room Type : " + roomType);
        System.out.println("     No of Days : " + d);
        System.out.println("---------------------------------------------------------");
        double tot = d * roomRent;
        System.out.println("Total Payable Amount =   Rs " + tot);
        System.out.println("------------------------------------------------------------------\n====================================");
    }

    public static void main(String[] args) throws IOException {
        Main hotel = new Main();
        hotel.startHotelReservationSystem();
    }
}
