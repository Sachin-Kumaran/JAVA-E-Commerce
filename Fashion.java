import java.util.*;
public class Fashion {
    static String[] bill_name=new String[50];
    static int[] bill_item_qty=new int[50];
    static int[] bill_item_cost=new int[50];
    static int[] bill_item_amt=new int[50];
    static int total=0;
    public static void main(String[] args)
    {   Tshirts ob=new Tshirts();
        Shirts ob1=new Shirts();
        Pants ob2=new Pants();
        Accesories ob3=new Accesories();
        Cosmetic ob4=new Cosmetic();
        System.out.println("Welcome to Zudio's Fashion");
        System.out.println("1.Men\t2.Women\t3.Kids");
        Scanner in=new Scanner(System.in);
        int choice=in.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("1.Tshirts\n2.Shirts\n3.Pants\n4.Accesories");
                int ch1=in.nextInt();
                switch(ch1)
                {
                    case 1:
                    {
                         ob.Unisex(0,0);
                         break;
                    }
                    case 2:
                    {
                        ob1.Unisex(0);
                        break;
                    }
                    case 3: {
                        ob2.Unisex(0);
                        break;
                    }
                    case 4:
                    {
                        ob3.access();
                    }
                    default:
                    {
                        System.out.println("INVALID");
                    }
                }
                break;
            }
            case 2:
            {
                System.out.println("1.Tshirt\t2.Shirt\t3.Pants\t4.Cosmetics");
                int you=in.nextInt();
                switch(you)
                {
                    case 1:
                    {
                        ob.Unisex(1,0);
                        break;
                    }
                    case 2:
                    {
                        ob1.Unisex(0);
                        break;
                    }
                    case 3:
                    {
                        ob2.Unisex(0);
                        break;
                    }
                    case 4:
                    {
                        ob4.cos();
                        break;
                    }
                    default:
                    {
                        System.out.println("INVALID");
                    }
                }
                break;
            }
            case 3:
            {
                System.out.println("1.Boy\t2.Girl");
                int gen=in.nextInt();
                System.out.println("1.Tshirts\n2.Shirts\n3.Pants");
                int ch1=in.nextInt();
                System.out.println("XS-7-8yrs, S-9-10yrs,M-11-12,L-12-13 ,XL-13-14");
                switch(ch1) {
                    case 1: {
                        ob.Unisex(gen-1, 50);
                        break;
                    }
                    case 2: {
                        ob1.Unisex(50);
                        break;
                    }
                    case 3: {
                        ob2.Unisex(100);
                        break;
                    }
                    default:
                        System.out.println("INVALID");
                }
                break;
            }
            default:
                System.out.println("INVALID");
        }
        System.out.println("Press 1 to Purchase more 0- to Get your bill");
        int ju=in.nextInt();
        if(ju==1)
        {
            Fashion.main(null);
        }
        else if(ju==0)
        {
            String fo=String.format("%s"+"%10s"+"%25s"+"%12s"+"%10s","Item no.","Item name","Price","Quantity","Amount");
            System.out.println(fo);
            System.out.println("-".repeat(70));
            for(int i=0;i<50;i++)
            {
                if(!((bill_name[i])==null)) {
                   String fid=String.format("%-"+10+"d",i+1);
                   String fname=String.format("%-"+30+"s",bill_name[i]);
                   String fcost=String.format("%-"+10+"d",bill_item_cost[i]);
                   String fqty=String.format("%-"+13+"d",bill_item_qty[i]);
                   String famount=String.format("%-"+20+"d",bill_item_amt[i]);
                   System.out.println(fid+fname+fcost+fqty+famount);
                }
                else break;
            }
            System.out.println();
            String total1=String.format("%s"+"%56s","Total:-",(total+"/-"));
            System.out.println(total1);
        }
    }
}
