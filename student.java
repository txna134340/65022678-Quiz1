import java.util.jar.Attributes.Name;

public class student {
    private int ID ;
    private String Name ;
    private int addmissionYear ;
    private double GPA ;  
}

public String getName() {
    return Name;
}
public int getID() {
    return ID;
}
public int getaddmissionYear() {
    return addmissionYear;
}
public double getGPA() {
    return GPA;
}
public void setName(String Name) {
    this.Name = Name;
}
public void setID(int ID) {
    this.ID = ID;
}
public void setaddmissionYear(String addmissionYear) {
    this.addmissionYear = addmissionYear;
}
public void setGpa(double GPA) {
    this.GPA = GPA;
}

public void ShowDetails() {
    System.out.println("Name: " + Name);
    System.out.println("Age: " + ID);
    System.out.println("Student ID: " + addmissionYear);
    System.out.println("GPA: " + GPA);
}