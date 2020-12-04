package application.action;

import application.ApplicationContextBankAgency;
import bank.Account;

public class ActionSeeAccountNumber implements Action {
    private String message = "-";
    private String code = "-";
    public ActionSeeAccountNumber(String message, String code) {
        this.message = message;
        this.code = code;
    }
    @Override
    public String actionMessage() {
        return message;
    }
    @Override
    public String actionCode() {
        return code;
    }
    @Override
    public void execute(ApplicationContextBankAgency context) throws Exception {
        context.printStream.print("Account number is -> ");
        String number = context.scanner.next();
        Account account = context.bankAgency.getAccount(number);
        if (account == null) {
            System.out.println("Account does not exist...");
        } else {
            account.print();
        }
    }
}
