import java.util.ArrayList;
import java.util.Scanner;

public class Show {
    // BEGIN: ed8c6549bwf9
    private String title;
    private String startDate;
    private String endDate;
    private ArrayList<String[]> crew;

    public Show(String title, String startDate, String endDate) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.crew = new ArrayList<String[]>();
    }

    // Getters and setters for title, startDate, endDate, and crew
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ArrayList<String[]> getCrew() {
        return crew;
    }

    public void addCrew() {
        boolean addMore = true;
        Scanner input = new Scanner(System.in);
        while (addMore){
            System.out.print("Enter crew member's name: ");
            String name = input.nextLine();
            System.out.print("Enter crew member's role: ");
            String role = input.nextLine();
            String[] crewMember = {name, role};
            this.crew.add(crewMember);
            System.out.print("Add another crew member? (y/n): ");
            String answer = input.nextLine();
            if (answer.equals("n")){
                addMore = false;
            }
        }
        input.close();
        
    }
}