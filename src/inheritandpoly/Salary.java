package inheritandpoly;

public class Salary {
    void salary(int salaryPerMonth,int gst){
        System.out.println(salaryPerMonth*gst);
    }
    void salary(int salaryPerMonth){
        System.out.println(salaryPerMonth);
    }
    void salary(int salaryPerMonth,float gst){
        System.out.println(salaryPerMonth*gst);
    }

}

