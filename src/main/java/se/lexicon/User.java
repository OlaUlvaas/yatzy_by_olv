package se.lexicon;

public class User {
    private int cardNum;
    private String firstName;
    private String lastName;
    private int phone;

    public User(int cardNum, String firstName, String lastName, int phone) {
        this.cardNum = cardNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public int getPhone(){
        return phone;
    }

    public int getCardNum() {
        return cardNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return cardNum + " " + firstName + " " + lastName + " " + phone;

    }
}
