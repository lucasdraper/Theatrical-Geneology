import java.util.ArrayList;

public class Person {
    private String FirstName = "";
    private String LastName = "";
    private ArrayList<Show> Shows;

    public Person(String fn, String ln){
        this.FirstName = fn;
        this.LastName = ln;
        this.Shows = new ArrayList<Show>();
    }

    public String getName(){
        return FirstName + " " + LastName;
    }

    public void addshow(Show Showname){
        Shows.add(Showname);
    }
}
