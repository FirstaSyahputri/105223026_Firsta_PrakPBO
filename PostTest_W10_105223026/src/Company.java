class Employee {
    String name;
    String position;

    Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void calculateSalary() {
        System.out.println(position + " " + name + ": Rp 3.000.000");
    }

    public void calculateSalary(boolean withBonus) {
        if (withBonus) {
            System.out.println(position + " " + name + " (dengan bonus): Rp 4.000.000");
        } else {
            calculateSalary();
        }
    }
}

class SoftwareEngineer extends Employee {
    SoftwareEngineer(String name) {
        super(name, "Software Engineer : ");
    }

    @Override
    public void calculateSalary() {
        System.out.println(position + " " + name + ": Rp 5.000.000");
    }

    @Override
    public void calculateSalary(boolean withBonus) {
        if (withBonus) {
            System.out.println(position + " " + name + " (dengan bonus): Rp 7.000.000");
        } else {
            calculateSalary();
        }
    }
}

class DataScientist extends Employee {
    DataScientist(String name) {
        super(name, "Data Scientist : ");
    }

    @Override
    public void calculateSalary() {
        System.out.println(position + " " + name + ": Rp 6.000.000");
    }

    @Override
    public void calculateSalary(boolean withBonus) {
        if (withBonus) {
            System.out.println(position + " " + name + " (dengan bonus): Rp 8.500.000");
        } else {
            calculateSalary();
        }
    }
}

class Intern extends Employee {
    Intern(String name) {
        super(name, "Intern : ");
    }

    @Override
    public void calculateSalary() {
        System.out.println(position + " " + name + ": Rp 1.500.000");
    }

    @Override
    public void calculateSalary(boolean withBonus) {
        if (withBonus) {
            System.out.println(position + " " + name + " (dengan bonus): Rp 2.000.000");
        } else {
            calculateSalary();
        }
    }
}

public class Company {
    public static void main(String[] args) {
        Employee[] employees = {
            new SoftwareEngineer("Budi"),
            new DataScientist("Siti"),
            new Intern("Andi")
        };

        System.out.println("Gaji dasar semua karyawan (polymorphism):");
        for (Employee e : employees) {
            e.calculateSalary();
        }

        System.out.println("\nGaji dengan bonus (langsung panggil objek):");
        for (Employee e : employees) {
            e.calculateSalary(true);
        }
    }
}
