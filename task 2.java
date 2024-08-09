import java.util.*;



public class Main {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the Physcis marks :");
        int ph=sc.nextInt();
        System.out.println("Enter the Chemistry marks :");
        int ch= sc.nextInt();
        System.out.println("Eneter the English marks :");
        int en= sc.nextInt();
        System.out.println("Enter the Maths marks : ");
        int ma= sc.nextInt();
        System.out.println("Enter the biology marks : ");
        int bo=sc.nextInt();

        int total = ph + ch + en + ma + bo;
        System.out.println("Total marks is : " +total);

        float avg = (total/500.9f)*100;
        System.out.println("Avegrage percentage is : "+avg);

        if(avg== 100 && avg >90)
        {
            System.out.println("Your Grade is A ");
        }

        else if(avg >70 && avg <=90)
        {
            System.out.println("Your Grade is B ");
        }

        else if(avg >50 && avg <=70)
        {
            System.out.println("Your Grade is C ");
        }

        else if(avg >40 && avg <=50)
        {
            System.out.println("Your Grade is D ");

        }

        else if(avg>35 && avg <=40)
        {
            System.out.println("Your Grade is E ");

        }

        else {
            System.out.println("Your Grade is F");
        }
    }


}
