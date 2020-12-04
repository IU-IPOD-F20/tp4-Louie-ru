import application.ApplicationContextBankAgency;
import application.action.ActionAccountsLists;
import application.action.ActionSeeAccountNumber;
import application.actionlist.GenericActionList;

public class BankAgencyApp {
    public static void main(String argv[]) throws Exception {
        ApplicationContextBankAgency context = ApplicationContextBankAgency.getInstance();
        GenericActionList menu = new GenericActionList("Generic menu", "0", "Generic Menu");
        menu.addAction(new ActionAccountsLists("List agency accounts", "1"));
        menu.addAction(new ActionSeeAccountNumber("See account by its number", "2"));
        menu.execute(context);
    }
}
