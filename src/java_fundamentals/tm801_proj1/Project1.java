package java_fundamentals.tm801_proj1;

public class Project1 {
	private int empNo[] = {1001,1002,1003,1004,1005,1006,1007};
    private String empName[] = {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
    private String joinDate[] = {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
    private char desigCode[] = {'e','c','k','r','m','e','c'};
    private String dept[] = {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
    private int basic[] = {20000,30000,10000,12000,50000,23000,29000};
    private int hra[] = {8000,12000,8000,6000,20000,9000,12000};
    private int it[] = {3000,9000,1000,2000,20000,4400,10000};

    private int getIndex(int id) {
        for(int i=0;i<empNo.length;i++) {
            if(empNo[i]==id)
                return i;
        }
        return -1;
    }

    private String getDesignation(char code) {
        switch(code) {
            case 'e': return "Engineer";
            case 'c': return "Consultant";
            case 'k': return "Clerk";
            case 'r': return "Receptionist";
            case 'm': return "Manager";
            default : return "";
        }
    }

    private int getDA(char code) {
        switch(code) {
            case 'e': return 20000;
            case 'c': return 32000;
            case 'k': return 12000;
            case 'r': return 15000;
            case 'm': return 40000;
            default : return 0;
        }
    }

    public static void main(String[] args) {

        if(args.length!=1) {
            System.out.println("Usage : java Project1 <EmpId>");
            return;
        }

        int id=Integer.parseInt(args[0]);

        Project1 obj=new Project1();

        int index=obj.getIndex(id);

        if(index==-1) {
            System.out.println("There is no employee with empid : "+id);
        }
        else {

            int salary=obj.basic[index]+obj.hra[index]+obj.getDA(obj.desigCode[index])-obj.it[index];

            System.out.printf("%-8s %-10s %-15s %-15s %-10s\n","Emp No.","Emp Name","Department","Designation","Salary");

            System.out.printf("%-8d %-10s %-15s %-15s %-10d",
                    obj.empNo[index],
                    obj.empName[index],
                    obj.dept[index],
                    obj.getDesignation(obj.desigCode[index]),
                    salary);
        }
    }
}
