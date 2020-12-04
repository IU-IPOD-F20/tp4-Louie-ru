package application;

import bank.BankAgency;

import java.io.PrintStream;
import java.util.Scanner;

//singletone
public class ApplicationContextBankAgency {
    private static ApplicationContextBankAgency inst = null;
    public static ApplicationContextBankAgency getInstance() {
        if (inst == null)
            inst = new ApplicationContextBankAgency();
        return inst;
    }
    private ApplicationContextBankAgency() {
        bankAgency = AccesBankAgency.getBankAgency();
        scanner = new Scanner(System.in);
        printStream = System.out;
    }
    public BankAgency bankAgency;
    public Scanner scanner;
    public PrintStream printStream;
}
