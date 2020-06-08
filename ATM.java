// Starting Balance: $2000.50
// Account Number: 1122334455
// Account Password: 1234

import java.util.Scanner;
import java.util.Date;

public class ATM {
	
	double balance;
	int accountNumber;
	int accountPassword;
	int userInputAccountNumber;
	int userInputPassword;
	Scanner keyboard = new Scanner(System.in);
	Date date = new Date();
	
	public ATM(double userBalance, int userAccountNumber, int userPassword) {
		balance = userBalance;
		accountNumber = userAccountNumber;
		accountPassword = userPassword;
	}
	
	public void getTime() {
		System.out.println("Time: " + date);
	}
	
	public void askForAccountNumber() {
		System.out.print("Please enter your account number to continue: ");
		userInputAccountNumber = keyboard.nextInt();
		if (userInputAccountNumber != accountNumber ) {
			tryAgain(accountNumber, 5);
		}
	}	
	
	public void askForAccountPassword() {
		System.out.print("Please enter your account password to continue: ");
		userInputPassword = keyboard.nextInt();
		if (userInputPassword != accountPassword ) {
			tryAgain(accountPassword, 3);
		}
	}
	
	public void tryAgain(int actualInput, int numberOfTries) {
		for (int i = 2 ; i <= numberOfTries ; i++) {
			System.out.println("Sorry that was incorrect, please try again.");
			System.out.print("Attempt " + i + ": ");
			int attempt = keyboard.nextInt();
			if (attempt == actualInput) {
				return;
			}
		}
		System.out.println("Sorry! Too many incorrect attempts!");
		System.exit(0);
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public void deposit() {
		System.out.print("Deposit Amount: $");
		double userDeposit = keyboard.nextDouble();
		while (userDeposit < 0 ) {
			System.out.println("Invalid Amount!");
			System.out.print("Deposit Amount: $");
			userDeposit = keyboard.nextDouble();
		}
		balance += userDeposit;
		System.out.println("You have deposited $" + userDeposit);
	}
	
	public void withdraw() {
		System.out.print("Withdraw Amount: $");
		double userWithdraw = keyboard.nextDouble();
		while (userWithdraw < 0 || userWithdraw > balance) {
			System.out.println("Invalid Amount!");
			System.out.print("Withdraw Amount: $");
			userWithdraw = keyboard.nextDouble();
		}
		balance -= userWithdraw;
		System.out.println("You have withdrawn $" + userWithdraw);
	}
	
	public void giveUserOptions() {
		boolean userIsFinished = false;
		while(userIsFinished == false) {
			System.out.println("Options: \n1.Check Balance\n2.Deposit\n3.Withdraw\n4.Quit");
			System.out.print("> ");
			int userChoice = keyboard.nextInt();
			if (userChoice == 1) {
				checkBalance();
			}
			else if (userChoice == 2) {
				deposit();
			}
			else if (userChoice == 3) {
				withdraw();
			}
			else if (userChoice == 4) {
				userIsFinished = true;
				System.out.println("Have a good day!");
			}
		}
	}
	
	public static void main(String[] args) {
		ATM machine = new ATM(2000.50, 1122334455, 1234);
		machine.getTime();
		machine.askForAccountNumber();
		machine.askForAccountPassword();
		machine.giveUserOptions();
	}
	
}
