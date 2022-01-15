public class StudentDetails {

    StudentDetails(){
        return;
    }

    StudentDetails(String name, int admno, String branch, String semester, int distanceToHome, Boolean ecoBack, Boolean paid, int paidAmount){
        this.name = name;
        this.admno = admno;
        this.branch = branch;
        this.semester = semester;
        this.distanceToHome = distanceToHome;
        this.ecoBack = ecoBack;
        this.paid = paid;
        this.paidAmount = paidAmount;
    }

    String name;
    int admno;
    String branch;
    String semester;
    int distanceToHome;
    Boolean ecoBack;
    Boolean paid;
    int paidAmount;
}
