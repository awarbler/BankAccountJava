
import java.text.DecimalFormat;

public abstract class Account {
    /**
     * Function name: Account
     * 
     * private String id
     * private String name
     * private double balance
     * 
     * abstract - so no children can create objects
     */
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name, double balance) {
        /**
         * Function name: Account
         * constructor
         */

        // QUALITY CONTROL
        // throw an error put it in the parent so we dont have to repeat code
        // IN EACH CHILD
        // INVALID PARAMETER
        if (id == null || id.isBlank() || name == null || name.isBlank()) {
            throw new IllegalArgumentException("INVALID PARAMS ");
        }
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(Account source) {
        /**
         * function name: Account
         * copy constructor
         */
        this.id = source.id;
        this.name = source.name;
        this.balance = source.balance;
    }

    /**
     * Function name: getId
     * 
     * @return (this.id )
     * 
     *         getters and setters
     */

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        // quality control
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("INVALID NAME");
        }

        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Allow a deposit
    public abstract void deposit(double amount);

    // Allow a withdraw because it can accept or fail
    public abstract boolean withdraw(double amount);

    // protected - helps keep info protected
    // accessible only to child

    protected double round(double amount) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        return Double.parseDouble(formatter.format(amount));
    }

    @Override
    public String toString() {
        /**
         * override every child inherits
         */
        return (this.getClass().getSimpleName()) + "    " +
                "\t" + this.getId() + "" +
                "\t" + this.getName() + "" +
                "\t$" + this.getBalance() + "";
    }

}
