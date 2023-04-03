package Main;

import java.util.Scanner;  
class Account {  
    private String accid;  
    private String name;  
    private String acc_type;  
    private long balance;  
    private int pin;
    Scanner sc = new Scanner(System.in);  

    public void openAccount() {  
        System.out.print("Enter Account ID: ");  
        accid = sc.next();  
        System.out.print("Enter Name: ");  	
        name = sc.next();  
        System.out.print("Enter Your Pin Password: ");   
        pin = sc.nextInt();
        int length = String.valueOf(pin).length();
        while(length > 4) {
            pin = sc.nextInt();
            length = String.valueOf(pin).length();
        }
        System.out.print("Enter Account type: ");  
        acc_type = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();  
    }  
  
    public void showAccount() {  
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account ID.: " + accid); 
        System.out.println("Account type: " + acc_type);  
        System.out.println("Account Balance: " + balance+"$"); 
        System.out.println("Pin: " + pin);  
    }  
   
    public void deposit() {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;  
	    System.out.println("Balance after diposit: " + balance+"$"); 
    }  

    public void withdraw() {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdraw: " + balance+"$");  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }
    
    public void change() {
    int newpin;
    int newpin1;
    System.out.println("Please enter your new PIN:");
    newpin = sc.nextInt();
   int length = String.valueOf(newpin).length();
   while(length > 4) {
       pin = sc.nextInt();
       length = String.valueOf(newpin).length();
   }
  System.out.println("Please enter your new PIN again:");
  newpin1 = sc.nextInt();
 length = String.valueOf(newpin1).length();
 while(length >4) {
     newpin1 = sc.nextInt();
     length = String.valueOf(newpin1).length();
 }
 for(int i=0;i<3;i++) {
 if(newpin1==newpin) {
    pin=newpin;}
 else if(i<3) {System.out.println("Error please Enter your PIN again:");
 newpin1=sc.nextInt(5);
 } else {break;
	
 }
    }}
    
 
    public boolean search(String ac_id) {  
        if (accid.equals(ac_id)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }
    public boolean search1(String ac_no) {  
        if (accid.equals(ac_no)) {  
     System.out.println("Account holder is:"+name);
     System.out.println("Please Enter Your PIN to continue");
            return (true);  
        }  
        return (false);  
    }  
    public boolean search2(int spin) {  
        if (pin==spin) {  
            return (true);  
        }  
        return (false);  
    }
}  
