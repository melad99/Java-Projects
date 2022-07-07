package cartproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorPatternCustomer {

    private static int choice;

    public static void main(String args[]) throws NumberFormatException, IOException {
        do {
            System.out.print("========= Backpack option ============ \n");
            System.out.print("            1. Plain Backpack.   \n");
            System.out.print("            2. Backpack WithLaptopSlot.\n");
            System.out.print("            3. Backpack WithUSBCharge. \n");
            System.out.print("            4. Backpack WithWaterBottle. \n");
            System.out.print("            5. All Option. \n");
            System.out.print("            6. Exit                    \n");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1: {
                    PlainBackpack vf = new PlainBackpack();
                    System.out.println(vf.preparePack());
                    System.out.println(vf.packPrice());
                }
                break;

                case 2: {
                    Backpack f1 = new WithLaptopSlot((Backpack) new PlainBackpack());
                    System.out.println(f1.preparePack());
                    System.out.println(f1.packPrice());
                }
                break;
                case 3: {
                    Backpack f2 = new WithUSBCharge((Backpack) new PlainBackpack());
                    System.out.println(f2.preparePack());
                    System.out.println(f2.packPrice());
                }
                break;
                case 4: {
                    Backpack f3 = new WithWaterBottle((Backpack) new PlainBackpack());
                    System.out.println(f3.preparePack());
                    System.out.println(f3.packPrice());
                }
                break;
                case 5: {
                    Backpack all = new WithLaptopSlot((Backpack) new WithUSBCharge(new WithWaterBottle(new PlainBackpack())));
                    System.out.println(all.preparePack());
                    System.out.println(all.packPrice());
                }
                break;

                default: {
                    System.out.println("You have got out,Have a nice day");
                }
                return;
            }

        } while (choice != 6);
    }
}
