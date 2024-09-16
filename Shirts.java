import java.util.*;
public class Shirts {
    void Unisex(int u) {
        int void1;
        do {
            System.out.println("1.Formals\n2.Casuals");
            Scanner os = new Scanner(System.in);
            int ch1_1 = os.nextInt();
            Scanner in = new Scanner(System.in);
            int[] id = {1, 2, 3, 4};
            int idc = 10;
            int cdc = 30;
            int rdc = 10;
            int qty;
            String[] color = new String[4];
            int[] rate = new int[4];
            System.out.println("XS-Extra Small , S-Small , M-Medium , L-Large , XL-Extra Large");
            System.out.print("Size: ");
            String s = (in.next()).toUpperCase();
            switch (ch1_1) {
                case 1: {
                    color = new String[]{"Black", "Blue Checkered", "Pink", "White"};
                    break;
                }
                case 2: {
                    color = new String[]{"Beach", "Linen white", "Silver Party wear", "Printed"};
                    break;
                }
                default: {
                    System.out.println("INVALID");
                }
            }
            switch (s) {
                case "XS": {
                    rate = new int[]{189 - u, 189 - u, 199 - u, 199 - u};
                    break;
                }
                case "S": {
                    rate = new int[]{199 - u, 199 - u, 209 - u, 209 - u};
                    break;
                }
                case "M": {
                    rate = new int[]{209 - u, 209 - u, 219 - u, 219 - u};
                    break;
                }
                case "L": {
                    rate = new int[]{219 - u, 219 - u, 249 - u, 249 - u};
                    break;
                }
                case "XL": {
                    rate = new int[]{249 - u, 249 - u, 269 - u, 269 - u};
                    break;
                }
                default:
                    System.out.println("INVALID");
                    break;
            }
            String fo = String.format("%s" + "%13s" + "%30s", "ID", "Model", "Price");
            System.out.println(fo);
            System.out.println("-".repeat(idc + cdc + rdc));
            for (int i = 0; i < id.length; i++) {
                String fid = String.format("%-" + idc + "d", id[i]);
                String fmd = String.format("%-" + cdc + "s", color[i]);
                String fpr = String.format("%-" + rdc + "s", (rate[i] + "/-"));
                System.out.println(fid + fmd + fpr);
            }
            int ko;
            do {
                System.out.print("Enter the item you want : ");
                int item = os.nextInt();
                System.out.print("Enter quantity : ");
                qty = os.nextInt();
                for (int i = 0; i < 50; i++) {
                    if ((Fashion.bill_name[i]) == null) {
                        Fashion.bill_name[i] = color[item - 1];
                        Fashion.bill_item_cost[i] = rate[item - 1];
                        Fashion.bill_item_qty[i] = qty;
                        Fashion.bill_item_amt[i] = (Fashion.bill_item_cost[i]) * (Fashion.bill_item_qty[i]);
                        Fashion.total += Fashion.bill_item_cost[i] * Fashion.bill_item_qty[i];
                        break;
                    } else if ((Fashion.bill_name[i]).equals(color[item - 1])) {
                        if (!((Fashion.bill_item_cost[i]) == (rate[item - 1]))) {
                            for (int j = i + 1; j < 50; j++) {
                                if (Fashion.bill_name[j] == null) {
                                    Fashion.bill_name[j] = color[item - 1];
                                    Fashion.bill_item_cost[j] = rate[item - 1];
                                    Fashion.bill_item_qty[j] += qty;
                                    Fashion.bill_item_amt[j] = (Fashion.bill_item_cost[j]) * (Fashion.bill_item_qty[j]);
                                    break;
                                }
                            }
                        } else {

                            Fashion.bill_item_qty[i] += qty;
                        }
                        Fashion.total += Fashion.bill_item_cost[i] * Fashion.bill_item_qty[i];
                        break;
                    }
                }
                System.out.println("Enter 1 to purchase another model of same size or 0-check for more");
                ko=os.nextInt();
            }
            while(ko==1);
            System.out.println("Enter 1-to Go back to Shirts Menu 0-Main menu");
            int void2 = os.nextInt();
            void1 = void2;
            if (void2 == 1) {
                System.out.println("1.Men\t2.Kids");
                int gen = os.nextInt();
                if (gen == 1) {
                    u = 0;
                } else if (gen == 2) {
                    u = 100;
                }
            }
        }
        while (void1 == 1);
    }
}