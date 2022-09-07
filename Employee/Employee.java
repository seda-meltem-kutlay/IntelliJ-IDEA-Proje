public class Employee {
    String name;
    double salary;
    int hireYear;
    int workHours;

    Employee(String name, double salary, int hireYear, int workHours) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.workHours = workHours;
    }

    public double tax() {

        if (this.salary < 1000) {
            return salary;
        } else {
            double tax = salary * 0.03;
            return tax;
        }
    }

    public int bonus() {
        if (workHours > 40) {
            int bonus = (workHours - 40) * 30;
            return bonus;
        }
        return 0;
    }

    public double raiseSalary() {
        if (hireYear <= 0 || hireYear > 2021) {
            System.out.println("Hatalı giriş yaptınız, tekrar deneyin.");
        } else {
            int farkYil = 2021 - hireYear;
            double zam;
            if (farkYil > 0 && farkYil < 10) {
                zam = salary * 0.05;
                return zam;
            } else if (farkYil > 9 && farkYil < 20) {
                zam = salary * 0.01;
                return zam;
            } else if (farkYil > 19) {
                zam = salary * 0.15;
                return zam;
            } else if (farkYil == 0) {
                return 0;

            }
        }
        return 0;
    }

    public String toString() {
        double total = salary - tax() + bonus() + raiseSalary();
        double tot = salary + bonus() - tax();
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma saati : " + this.workHours);
        System.out.println("Başlama yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maaş artışı : " + this.raiseSalary());
        System.out.println("Vergi+Bonus ile maaş : " + tot);
        System.out.println("Toplam maaş : " + total);
        return null;
    }
}

