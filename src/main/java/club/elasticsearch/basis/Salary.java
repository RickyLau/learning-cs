package club.elasticsearch.basis;

/**
 * Use this class to test private & public access specifier .
 *
 * @author <a href="mailto:RickyLau5016@gmail.com">Ricky Lau</a>
 * @version 0.0.1 2020-03-18 00:50:40
 */
public class Salary {
    // In china,most of companies salary composite two part,one is base salary(solid), the other is merit salary(float).
    /**
     * solid salary.
     */
    private double baseSalary;
    /**
     * float salary.
     */
    private double meritSalary;

    /**
     * days of work, usually 22 days a month.
     */
    public static final int WORK_DAYS = 22;

    public Salary(double baseSalary, double meritSalary) {
        this.baseSalary = baseSalary;
        this.meritSalary = meritSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getMeritSalary() {
        return meritSalary;
    }

    public void setMeritSalary(double meritSalary) {
        this.meritSalary = meritSalary;
    }

    public double getTotalSalary() {
        return this.baseSalary + meritSalary;
    }
}
