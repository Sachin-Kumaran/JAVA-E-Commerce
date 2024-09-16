import java.util.*;
public class Cosmetic {
    void cos()
    {
        int void1;
        do {
            System.out.println("1.Lipstick\n2.Mascara\n3.Kajal\n4.Eyeliner");
            Scanner x = new Scanner(System.in);
            int[] id = {1, 2, 3, 4};
            int idc = 10;
            int cdc = 30;
            int rdc = 10;
            int qty;
            String[] color = new String[5];
            int[] rate = new int[5];
            int ch1_1 = x.nextInt();
            if (ch1_1 > 0 && ch1_1 < 5) {
                switch (ch1_1) {
                    case 1: {
                        color = new String[]{"Lakme Matte Pink", "Lakme Matte Red", "MAC Powder Lipstick", "Glitter Red"};
                        rate = new int[]{599, 599, 1699, 1799};
                        break;
                    }
                    case 2: {
                        color = new String[]{"Maybelline New York Mascara", "Blue Heaven Lash Twist ", "MARS Fabulash Volumising", "Maybelline New York Waterproof"};
                        rate = new int[]{335, 135, 229, 799};
                        break;
                    }
                    case 3: {
                        color = new String[]{"Eyetex Dazller", "LAKMÉ Eyeconic Black", "Maybelline New York Colossal", "Himalaya Herbals"};
                        rate = new int[]{50, 199, 199, 159};
                        break;
                    }
                    case 4: {
                        color = new String[]{"Maybelline Colossal Bold Pencil", "Lakme Insta Eye Liner", "SUGAR POP Matte Finish"};
                        rate = new int[]{249, 199, 219};
                        break;
                    }
                    default:
                        System.out.println("Invalid");
                }
                String fo = String.format("%s-" + "%10s-" + "%30s-", "ID", "Model", "Price");
                System.out.println(fo);
                System.out.println("-".repeat(idc + cdc + rdc));
                for (int i = 0; i < color.length; i++) {
                    String fid = String.format("%-" + idc + "d", id[i]);
                    String fmd = String.format("%-" + cdc + "s", color[i]);
                    String fpr = String.format("%-" + rdc + "d", rate[i]);
                    System.out.println(fid + fmd + fpr);
                }
                int ko;
                do {
                    System.out.print("Enter the item you want : ");
                    int item = x.nextInt();
                    System.out.print("Enter quantity : ");
                    qty = x.nextInt();
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
                    ko=x.nextInt();
                }
                while(ko==1);
            } else System.out.println("INVALID");

            System.out.println("Enter 1-to Go back to Women Menu 0-Main Menu");
            void1 = x.nextInt();
        }
        while(void1==1);
    }
}
