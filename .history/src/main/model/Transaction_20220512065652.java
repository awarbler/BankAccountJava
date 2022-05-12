package main.model;

public class Transaction {
    public enum Type{WITHDRAW, DEPOSIT};
    private Type type;

    public long timeStamp;
    private String id;
    private double amount;


    public Transaction(Type type, long timeStamp, String id, double amount) {
        this.type = type;
        this.timeStamp = timeStamp;
        this.id = id;
        this.amount = amount;
    }
    public Transaction(Transaction source) {
        this.type = source.type;
        this.timeStamp = source.timeStamp;
        this.id = source.id;
        this.amount = source.amount;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
