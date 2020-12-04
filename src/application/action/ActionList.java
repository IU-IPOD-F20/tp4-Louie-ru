package application.action;

public interface ActionList extends Action {
    public String showTitle();
    public int length();
    public boolean addAction(Action ac);
}
