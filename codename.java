import java.util.Scanner;

class Staff {
    protected int code;
    protected String name;

    public Staff(int c, String n) {
        code = c;
        name = n;
    }

    public void display() {
        System.out.println("Code: " + code + ", Name: " + name);
    }
}

class Teacher extends Staff {
    private String subject, publication;

    public Teacher(int c, String n, String s, String p) {
        super(c, n);
        subject = s;
        publication = p;
    }

    public void display() {
        super.display();
        System.out.println("Subject: " + subject + ", Publication: " + publication);
    }
}

class Officer extends Staff {
    private String grade;

    public Officer(int c, String n, String g) {
        super(c, n);
        grade = g;
    }

    public void display() {
        super.display();
        System.out.println("Grade: " + grade);
    }
}

class Typist extends Staff {
    protected int speed;

    public Typist(int c, String n, int s) {
        super(c, n);
        speed = s;
    }
}

class RegularTypist extends Typist {
    private int salary;

    public RegularTypist(int c, String n, int s, int sal) {
        super(c, n, s);
        salary = sal;
    }

    public void display() {
        super.display();
        System.out.println("Speed: " + speed + ", Salary: " + salary);
    }
}

class CasualTypist extends Typist {
    private int dailyWages;

    public CasualTypist(int c, String n, int s, int dw) {
        super(c, n, s);
        dailyWages = dw;
    }

    public void display() {
        super.display();
        System.out.println("Speed: " + speed + ", Daily Wages: " + dailyWages);
    }
}

public class codename {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Teacher details: ");
        Teacher t = new Teacher(sc.nextInt(), sc.next(), sc.next(), sc.next());

        System.out.print("Enter Officer details: ");
        Officer o = new Officer(sc.nextInt(), sc.next(), sc.next());

        System.out.print("Enter Regular Typist details: ");
        RegularTypist r = new RegularTypist(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());

        System.out.print("Enter Casual Typist details: ");
        CasualTypist c = new CasualTypist(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());

        System.out.println("\n--- Details ---");
        t.display();
        o.display();
        r.display();
        c.display();

        sc.close();
    }
}
