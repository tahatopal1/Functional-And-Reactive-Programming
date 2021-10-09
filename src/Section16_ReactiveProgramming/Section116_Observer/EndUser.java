package Section16_ReactiveProgramming.Section116_Observer;

public class EndUser implements Observer {

    private String name;

    public EndUser(String name, SubjectLibrary subjectLibrary){
        this.name = name;
        subjectLibrary.subscribeObserver(this);
    }

    @Override
    public void update(String avail) {
        System.out.println("Hello " + name + "! We are glad to notify you that your book is now " + avail);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
