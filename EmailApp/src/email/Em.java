package email;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Em {
    public Scanner s = new Scanner(System.in);
    private String lname;
    private String fname;
    private String dept;
    private String email;
    private String password;
    private int mail_capacity=500;
    private String alter_mail;
    public Em(String fname, String lname){
        this.fname= fname;
        this.lname=lname;
        System.out.println("New Employee: "+this.fname+" "+this.lname);

        this.dept=this.setDept();
        this.password=this.gen_password(8);
        this.email=this.generate_email();


    }



    private String generate_email()
    {
        return this.fname.toLowerCase()+"."+this.lname.toLowerCase()+"@"+this.dept.toLowerCase()+".company.com";
    }
    private String setDept(){
        System.out.println("Department Codes\n1 For Sales\n2 For Development\n3 For Accounting \n4 For None ");
        boolean flag = false;
        do{
            System.out.println("Enter department code: ");
            int choice=s.nextInt();
            switch (choice){
                case 1:
                    return "Sales";
                case 2:
                    return "Development";
                case 3:
                    return "Accounting";
                case 0:
                    return "None";
                default:
                    System.out.println("Invalid choice");
            }
        }while(!flag);
        return null;
    }
    private String gen_password(int length)
    {
        Random r = new Random();
        String Cap_chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_chars= "abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String symbols="!@#$&?%_";
        String values= Cap_chars+small_chars+numbers+symbols;
        String password="";
        for(int i=0;i<length;i++)
        {
            password=password+values.charAt(r.nextInt(values.length()));
        }
        return password;
    }

    public void setPassword() {
        boolean flag=true;
        do{
            System.out.println("Do you want to change your password(Y/N) ");
            char choice =s.next().charAt(0);
            if (choice=='Y'||choice=='y')
            {
                flag=true;
                System.out.println("Enter password: ");
                String temp=s.next();
                if(temp.equals(this.password)){
                    System.out.println("Enter new password: ");
                    this.password=s.next();
                    System.out.println("Password changed ");
                }
                else{
                    System.out.println("Incorrect password ");
                }
            }
            else if(choice=='N'||choice=='n')
            {
                flag=true;
                System.out.println("Password change option cancelled ");
            }
            else{
                System.out.println("Enter valid choice ");
            }
        }while (!flag);
    }

    public void set_Mailcap()
    {
        System.out.println("Current capacity "+this.mail_capacity+" mb");
        System.out.println("Enter new capacity ");
        this.mail_capacity=s.nextInt();
        System.out.println("Mailbox capacity changed ");
    }
    public void alter_email()
    {
        System.out.println("Enter new alternate email ");
        this.alter_mail=s.next();
        System.out.println("Alternate email is set ");
    }

    public void dispInfo()
    {
        System.out.println("New employee: "+this.fname+" "+this.lname);
        System.out.println("Department "+this.dept);
        System.out.println("Email "+this.email);
        System.out.println("Password "+this.password);
        System.out.println("Inbox capacity "+ this.mail_capacity+" mb");
        System.out.println("Alternate email "+this.alter_mail);

    }
    public void store()
    {
        try {
            FileWriter x= new FileWriter("C:\\for me\\projects\\java\\emailAndInfo\\info.txt");
            x.write("First Name: "+this.fname);
            x.append("\nLast Name "+this.lname);
            x.append("\nDepartment "+this.dept);
            x.append("\nEmail "+this.email);
            x.append("\nPassword "+this.password);
            x.append("\nInbox capacity "+ this.mail_capacity+" mb");
            x.append("\nAlternate email "+this.alter_mail);
            x.close();
            System.out.println("Stored");

        }catch (Exception e){
            System.out.println(e);
        }

    }
    public void read_file()
    {
        try {
//            address where you need the file
            FileReader x1= new FileReader("C:\\for me\\projects\\java\\emailAndInfo\\info.txt");
            int i;
            while((i= x1.read())!=-1)
            {
                System.out.print((char)i);
            }
//            System.out.println();
            x1.close();


        }catch (Exception e){
            System.out.println(e);
        }
    }
}
