package main.model;

import java.util.Date;

public class Transaction {
    public enum Type{WITHDRAW, DEPOSIT};
    private Type type;

    public long timestamp;
    private String id;
    private double amount;


    public Transaction(Type type, long timestamp, String id, double amount){
        if(id == null || id.isBlank() || amount < 0){
            throw new IllegalAccessException("INVALID PARAMS");
        }
        this.type = type;
        this.timestamp = timestamp;
        this.id = id;
        this.amount = amount;
    }
    public Transaction(Transaction source) {
        this.type = source.type;
        this.timestamp = source.timestamp;
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
        return this.timestamp;
    }

    public void setTimeStamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id){
        if(id == null || id.isBlank() || amount < 0){
            throw new IllegalAccessException("INVALID ID");
        }
        this.id = id;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        if(amount < 0){
            throw new IllegalArgumentException("INVALID AMOUNT");
        }
        this.amount = amount;
    }
    public String returnDate(){
        Date date = new Date(this.timestamp * 1000);
        return new SimpleDateFormat("dd-MM-yyyy").format(date);
    }
    @Override
    public boolean equals(Object o){
        if(o == this)
        return true;
        if(!(o instanceof Transaction)){
            return false;
        }
        Transaction transaction =(Transaction) o;
        return Object.equals(type, transaction.type)&& timestamp == transaction.timestamp && Object.equals(id, transaction.id) && amount == transaction.amount; 
    }

    @Override
    public int compareTo(Transaction o){
        return Double.compare(this.timestamp,o.timestamp);
    }
    @Override
    public String toString() {
        returnDate(type) + "      " + 
        "\t" + this.returnDate() + 
        "\t$" + this.getAmount() + "";
    }


}
