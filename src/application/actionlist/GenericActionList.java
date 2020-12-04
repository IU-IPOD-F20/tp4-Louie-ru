package application.actionlist;

import application.ApplicationContextBankAgency;
import application.action.Action;
import application.action.ActionList;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericActionList implements ActionList {
    String message;
    String code;
    String title;
    ArrayList<Action> actionList;
    public GenericActionList(String message, String code, String title) {
        this.message = message;
        this.code = code;
        this.title = title;
        actionList = new ArrayList<>();
    }
    @Override
    public String showTitle() {
        return title;
    }
    @Override
    public int length() {
        return actionList.size();
    }
    @Override
    public boolean addAction(Action ac) {
        actionList.add(ac);
        return true;
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
        while (1==1) {
            System.out.println("---\n" + context.bankAgency.getAgencyName() + " (" + context.bankAgency.getAgencyLoc() + ")\n" + title + "\n---");
            for (Action action : actionList)
                System.out.println(String.format(" %s - %s", action.actionCode(), action.actionMessage()));
            System.out.println("\n0 - To exit\n\nChoice:");
            Scanner scanner = new Scanner(System.in);
            String code = scanner.next();
            if (code.equals("0"))
                return;
            for (Action action : actionList)
                if (action.actionCode().equals(code))
                    action.execute(context);
        }
    }
}
