package application.action;

import application.ApplicationContextBankAgency;

public interface Action {
    public String actionMessage();
    public String actionCode();
    public void execute(ApplicationContextBankAgency context) throws Exception;
}