import java.util.*;
class Pants {
    void Unisex(int m) {
        int void1;
        do {
            System.out.println("1.Formal\n2.Casual\n3.Trousers");
            Scanner os = new Scanner(System.in);
            Scanner x = new Scanner(System.in);
            int[] id = {1, 2, 3, 4};
            int idc = 10;
            int cdc = 30;
            int rdc = 10;
            int qty;
            String[] color = new String[5];
            int[] rate = new int[5];
            int ch1_1 = x.nextInt();
            if (ch1_1 > 0 && ch1_1 < 4) {
                System.out.println("XS-Extra Small , S-Small , M-Medium , L-Large , XL-Extra Large");
                System.out.print("Size: ");
                String s = (os.next()).toUpperCase();
                switch (s) {
                    case "XS": {
                        switch (ch1_1) {
                            case 1: {
                                color = new String[]{"Black Slim Fit", "Royal Blue", "Beige", "Brown"};
                                rate = new int[]{189 - m, 189 - m, 199 - m, 199 - m};
                                break;
                            }
                            case 2: {
                                System.out.println("1.Jean   2.Cotton");
                                int io = os.nextInt();
                                if (io == 1) {
                                    color = new String[]{"Classic Blue Jean", "Black Washed", "White Jean", "Grey"};
                                    rate = new int[]{599 - m, 699 - m, 699 - m, 799 - m};
                                } else if (io == 2) {
                                    color = new String[]{"Black Cargo", "Cordrouy Blue", "Linen White", "Knitted Beige"};
                                    rate = new int[]{399 - m, 499 - m, 599 - m, 599 - m};
                                }
                                break;
                            }
                            case 3: {
                                color = new String[]{"Black Athletic", "Sporty Green", "Casual Grey", "Casual Brown"};
                                rate = new int[]{189 - m, 189 - m, 199 - m, 199 - m};
                                break;
                            }
                        }
                        break;
                    }
                    case "S": {
                        switch (ch1_1) {
                            case 1: {
                                color = new String[]{"Black Slim Fit", "Royal Blue", "Beige", "Brown"};
                                rate = new int[]{199 - m, 199 - m, 209 - m, 209 - m};
                                break;
                            }
                            case 2: {
                                System.out.println("1.Jean   2.Cotton");
                                int io = os.nextInt();
                                if (io == 1) {
                                    color = new String[]{"Classic Blue Jean", "Black Washed", "White Jean", "Grey"};
                                    rate = new int[]{599 - m, 699 - m, 699 - m, 799 - m};
                                } else if (io == 2) {
                                    color = new String[]{"Black Cargo", "Cordrouy Blue", "Linen White", "Knitted Beige"};
                                    rate = new int[]{399 - m, 499 - m, 599 - m, 599 - m};
                                }
                                break;
                            }
                            case 3: {
                                color = new String[]{"Black Athletic", "Sporty Green", "Casual Grey", "Casual Brown"};
                                rate = new int[]{189 - m, 189 - m, 199 - m, 199 - m};
                                break;
                            }
                        }
                        break;
                    }
                    case "M": {
                        switch (ch1_1) {
                            case 1: {
                                color = new String[]{"Black Slim Fit", "Royal Blue", "Beige", "Brown"};
                                rate = new int[]{239 - m, 239 - m, 259 - m, 259 - m};
                                break;
                            }
                            case 2: {
                                System.out.println("1.Jean   2.Cotton");
                                int io = os.nextInt();
                                if (io == 1) {
                                    color = new String[]{"Classic Blue Jean", "Black Washed", "White Jean", "Grey"};
                                    rate = new int[]{699 - m, 799 - m, 799 - m, 899 - m};
                                } else if (io == 2) {
                                    color = new String[]{"Black Cargo", "Cordrouy Blue", "Linen White", "Knitted Beige"};
                                    rate = new int[]{499 - m, 599 - m, 599 - m, 699 - m};
                                }
                                break;
                            }
                            case 3: {
                                color = new String[]{"Black Athletic", "Sporty Green", "Casual Grey", "Casual Brown"};
                                rate = new int[]{219 - m, 219 - m, 239 - m, 239 - m};
                                break;
                            }
                        }
                        break;
                    }
                    case "L": {
                        switch (ch1_1) {
                            case 1: {
                                color = new String[]{"Black Slim Fit", "Royal Blue", "Beige", "Brown"};
                                rate = new int[]{249 - m, 249 - m, 269 - m, 269 - m};
                                break;
                            }
                            case 2: {
                                System.out.println("1.Jean   2.Cotton");
                                int io = os.nextInt();
                                if (io == 1) {
                                    color = new String[]{"Classic Blue Jean", "Black Washed", "White Jean", "Grey"};
                                    rate = new int[]{799 - m, 799 - m, 899 - m, 999 - m};
                                } else if (io == 2) {
                                    color = new String[]{"Black Cargo", "Cordrouy Blue", "Linen White", "Knitted Beige"};
                                    rate = new int[]{499 - m, 549 - m, 549 - m, 649 - m};
                                }
                                break;
                            }
                            case 3: {
                                color = new String[]{"Black Athletic", "Sporty Green", "Casual Grey", "Casual Brown"};
                                rate = new int[]{239 - m, 239 - m, 269 - m, 269 - m};
                                break;
                            }
                        }
                        break;
                    }
                    case "XL": {
                        switch (ch1_1) {
                            case 1: {
                                color = new String[]{"Black Slim Fit", "Royal Blue", "Beige", "Brown"};
                                rate = new int[]{289 - m, 289 - m, 299 - m, 299 - m};
                                break;
                            }
                            case 2: {
                                System.out.println("1.Jean   2.Cotton");
                                int io = os.nextInt();
                                if (io == 1) {
                                    color = new String[]{"Classic Blue Jean", "Black Washed", "White Jean", "Grey"};
                                    rate = new int[]{999 - m, 999 - m, 1099 - m, 1199 - m};
                                } else if (io == 2) {
                                    color = new String[]{"Black Cargo", "Cordrouy Blue", "Linen White", "Knitted Beige"};
                                    rate = new int[]{699 - m, 799 - m, 899 - m, 899 - m};
                                }
                                break;
                            }
                            case 3: {
                                color = new String[]{"Black Athletic", "Sporty Green", "Casual Grey", "Casual Brown"};
                                rate = new int[]{299 - m, 299 - m, 319 - m, 319 - m};
                                break;
                            }
                        }
                        break;
                    }
                    default: {
                        System.out.println("INVALID");
                    }
                }
                String fo = String.format("%s-" + "%10s-" + "%30s-", "ID", "Model", "Price");
                System.out.println(fo);
                System.out.println("-".repeat(idc + cdc + rdc));
                for (int i = 0; i < id.length; i++) {
                    String fid = String.format("%-" + idc + "d", id[i]);
                    String fmd = String.format("%-" + cdc + "s", color[i]);
                    String fpr = String.format("%-" + rdc + "d", rate[i]);
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
                while (ko==1);
            } else System.out.println("INVALID");
            System.out.println("Enter 1-to Go back to Pants Menu 0-Main Menu");
            void1 = os.nextInt();
            if (void1 == 1) {
                System.out.println("1.Men\t2.Kids");
                int gen = os.nextInt();
                if (gen == 1) {
                    m = 0;
                } else if (gen == 2) {
                    m = 100;
                }
            }
        }
        while(void1==1);
    }
}
