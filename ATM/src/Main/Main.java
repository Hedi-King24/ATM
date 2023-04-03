package Main;
import java.util.Scanner;
public class Main { 
	public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";     
    public static final String GREEN = "\033[0;32m";   
    public static final String YELLOW = "\033[0;33m";  
     
	    public static void main(String arg[]) {  
	        Scanner sc = new Scanner(System.in);  
	        System.out.println("\033[0;33m"+"\n ____________________________________________");
	        System.out.println("\033[0;33m"+"\n |               WELCOM TO                  |");  
	        System.out.println("\033[0;33m"+"\n |         ________________________         |");  
        	System.out.println("\033[0;33m"+"\n |_________CIHAN COMPANY ATM_______  |"); 
        	System.out.println("\033[0;33m"+"\n |       __________________________         |");  
        	System.out.println("\033[0;33m"+"\n |__________________________________________|"+"\033[0m"+"\n");
	        System.out.print("How many number of customers do you want to input? ");  
	        int n = sc.nextInt();  
	        Account C[] = new Account[n];  
	        for (int i = 0; i < C.length; i++) {  
	            C[i] = new Account();  
	            C[i].openAccount();  
	        }  
	   
	        int ch;  
	        do {  
	        	System.out.println("\033[0;32m"+"\n ____________________________________________");
	        	System.out.println("\033[0;32m"+"\n |       __________________________         |");  
	        	System.out.println("\033[0;32m"+"\n |_______Banking System Application_______  |"); 
	        	System.out.println("\033[0;32m"+"\n |       __________________________         |");  
	        	System.out.println("\033[0;32m"+"\n |__________________________________________|"+"\033[0m");
	            System.out.println(" 1. Display all account details \n"
	            		+ " 2. Search by Account ID\n 3. Deposit the amount \n "
	            		+ "4. Withdraw the amount \n 5.Change your PIN number \n 6.Exit ");  
	            System.out.println("Enter your choice: ");  
	            ch = sc.nextInt();  
	                switch (ch) {  
	                    case 1:  
	                        for (int i = 0; i < C.length; i++) {  
	                            C[i].showAccount();  
	                        }  
	                        break;  
	                    case 2:  
	                        System.out.print("Enter your account ID. you want to search: ");  
	                        String ac_id = sc.next();  
	                        boolean found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(ac_id);  
	                            if (found) {  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("\033[0;31m"+"Search failed! Account doesn't exist..!!"+"\033[0m");  
	                        }  
	                        break;  
	                    case 3:  
	                        System.out.print("Enter Account ID. : ");  
	                        ac_id = sc.next();  
	                        found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search1(ac_id);  
	                            int spin1 = sc.nextInt();
	                            found = C[i].search2(spin1); 
	                            if (found) {  
	                                C[i].deposit();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("\033[0;31m"+"Search failed! Account doesn't exist..!!"+"\033[0m");  
	                        }  
	                        break;  
	                    case 4:  
	                        System.out.print("Enter Account ID : ");  
	                        ac_id = sc.next();  
	                        found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search1(ac_id);  
	                           int spin1 = sc.nextInt();
	                            found = C[i].search2(spin1); 
	                            if (found) {  
	                                C[i].withdraw();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                        	 System.out.println("\033[0;31m"+"Search failed! Account doesn't exist..!!"+"\033[0m"); 
	                        }  
	                        break;  
	                    case 5:
	                        System.out.print("Enter Account ID : ");  
	                        ac_id = sc.next();  
	                        found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search1(ac_id);  
	                            int spin1 = sc.nextInt();
	                            found = C[i].search2(spin1); 
	                            if (found) {  
	                                C[i].change();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                        	 System.out.println("\033[0;31m"+"Search failed! Account doesn't exist..!!"+"\033[0m"); 
	                        }  
	                        break;  
	                    case 6:  
	                    	System.out.println("\033[0;33m"+"\n ____________________________________________");
	        	        	System.out.println("\033[0;33m"+"\n |       __________________________         |");  
	        	        	System.out.println("\033[0;33m"+"\n |_______THANKS FOR WORKING WITH US_______  |"); 
	        	        	System.out.println("\033[0;33m"+"\n |       __________________________         |");  
	        	        	System.out.println("\033[0;33m"+"\n |__________________________________________|");
	                        break;  
	                }  
	            }  
	            while (ch != 6);  
	    }}

