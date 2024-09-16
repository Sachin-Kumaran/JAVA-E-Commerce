import java.util.*;
public class Tshirts
{
    void Unisex(int y,int z) {
        int void1;
        do {
            Scanner os = new Scanner(System.in);
            Scanner x = new Scanner(System.in);
            int[] id = {1, 2, 3, 4};
            int idc = 10;
            int cdc = 30;
            int rdc = 10;
            int qty;
            String[] color = new String[4];
            int[] rate = new int[4];
            if (y == 0) {
                System.out.println("1.Oversized\n2.Polo\n3.Casuals");
                int ch1_1 = x.nextInt();
                if (ch1_1 > 0 && ch1_1 < 4) {
                    System.out.println("XS-Extra Small , S-Small , M-Medium , L-Large , XL-Extra Large");
                    System.out.print("Size: ");
                    String s = (os.next()).toUpperCase();
                    switch (ch1_1) {
                        case 1: {
                            color = new String[]{"Galaxy Printed Black", "Anime Printed White", "Graffiti Grey", "Cool Beige"};
                            break;
                        }
                        case 2: {
                            color = new String[]{"Green", "White", "Grey", "Yellow"};
                            break;
                        }
                        case 3: {
                            color = new String[]{"Classic Naruto", "OG One piece", "Plain black", "White"};
                            break;
                        }
                        default: {
                            System.out.println("INVALID");
                        }
                    }
                    switch (s) {
                        case "XS": {

                            rate = new int[]{189 - z, 189 - z, 199 - z, 199 - z};
                            break;
                        }
                        case "S": {
                            rate = new int[]{199 - z, 199 - z, 209 - z, 209 - z};
                            break;
                        }
                        case "M": {
                            rate = new int[]{209 - z, 209 - z, 219 - z, 219 - z};
                            break;
                        }
                        case "L": {
                            rate = new int[]{219 - z, 219 - z, 229 - z, 229 - z};
                            break;
                        }
                        case "XL": {
                            rate = new int[]{229 - z, 229 - z, 239 - z, 239 - z};
                            break;
                        }
                        default: {
                            System.out.println("INVALID");
                        }
                    }
                }
            } else {
                System.out.println("1.Oversized" + "\n" + "2.Full Sleeves");
                int yu = os.nextInt();
                System.out.println("XS-Extra Small , S-Small , M-Medium , L-Large , XL-Extra Large");
                System.out.print("Size: ");
                String s = (os.next()).toUpperCase();
                switch (yu) {
                    case 1: {
                        color = new String[]{"Galaxy Printed Black", "Anime Printed White", "Graffiti Grey", "Cool Beige"};
                        switch (s) {
                            case "XS": {
                                rate = new int[]{189 - z, 189 - z, 199 - z, 199 - z};
                                break;
                            }
                            case "S": {
                                rate = new int[]{199 - z, 199 - z, 209 - z, 209 - z};

                                break;
                            }
                            case "M": {
                                rate = new int[]{199 - z, 199 - z, 219 - z, 219 - z};
                                break;
                            }
                            case "L": {
                                rate = new int[]{219 - z, 219 - z, 229 - z, 229 - z};
                                break;
                            }
                            case "XL": {
                                rate = new int[]{249 - z, 249 - z, 269 - z, 269 - z};
                                break;
                            }
                            default:
                                System.out.println("INVALID");
                        }
                        break;
                    }
                    case 2: {
                        color = new String[]{"Green", "White", "Grey", "Yellow"};
                        switch (s) {
                            case "XS": {
                                rate = new int[]{189 - z, 189 - z, 199 - z, 199 - z};
                                break;
                            }
                            case "S": {
                                rate = new int[]{199, 199, 209, 209};
                                break;
                            }
                            case "M": {
                                rate = new int[]{199, 199, 219, 219};
                                break;
                            }
                            case "L": {
                                rate = new int[]{219, 219, 229, 229};
                                break;
                            }
                            case "XL": {
                                rate = new int[]{249, 249, 269, 269};
                                break;
                            }
                            default:
                                System.out.println("INVALID");

                        }
                        break;
                    }
                    default: {
                        System.out.println("INVALID");
                    }
                }
            }
            String fo = String.format("%s"+"%13s"+"%30s","ID","Model","Price");
            System.out.println(fo);
            System.out.println("-".repeat(idc + cdc + rdc));
            for (int i = 0; i < id.length; i++) {
                String fid = String.format("%-" + idc + "d", id[i]);
                String fmd = String.format("%-" + cdc + "s", color[i]);
                String fpr = String.format("%-" + rdc + "s", (rate[i]+"/-"));
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
            System.out.println("Enter 1-to Go back to T-shirts Menu 0-Main Menu");
            int void2 = os.nextInt();
            void1 = void2;
            if (void2 == 1) {
                System.out.println("1.Men\t2.Women\t3.Kids");
                int gen = os.nextInt();
                if (gen == 1) {
                    y = 0;
                    z = 0;
                } else if (gen == 2) {
                    y = 1;
                    z = 0;
                } else if (gen == 3) {
                    System.out.println("1.Boy\t2.Girl");
                    int gen1 = os.nextInt();
                    System.out.println("XS-7-8yrs, S-9-10yrs,M-11-12,L-12-13 ,XL-13-14");
                    y = gen1 - 1;
                    z = 50;
                }
            }
        }
        while(void1==1);
    }
}

