package email;

import java.util.Scanner;

public class emailM {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String f_name =s.next();
        System.out.println("Enter Last Name: ");
        String l_name =s.next();

        Em em1 = new Em(f_name,l_name);
        int choice =-1;
        do{
            System.out.println("Enter your choice\n1 Show info\n2 Change password \n3 Change mailbox capacity\n4 Set alternate mail\n5 Store data in file\n6 Display data from file\n7 Exit");
            choice=s.nextInt();
            switch (choice){
                case 1:
                    em1.dispInfo();
                    break;
                case 2:
                    em1.setPassword();
                    break;
                case 3:
                    em1.set_Mailcap();
                    break;
                case 4:
                    em1.alter_email();
                    break;
                case 5:
                    em1.store();
                    break;
                case 6:
                    em1.read_file();
                    break;
                case 7:
                    System.out.println("Thank you!!");
                    break;
                default:
                    System.out.println("Enter proper choice!!");
            }
        }while(choice!=7);
    }
}
