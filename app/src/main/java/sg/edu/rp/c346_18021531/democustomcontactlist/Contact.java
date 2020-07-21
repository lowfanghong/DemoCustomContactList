package sg.edu.rp.c346_18021531.democustomcontactlist;

public class Contact  {

    private String name;
    private int countrycode;
    private int phoneNum;
    private char gender;

    public Contact(String name, int countrycode, int phoneNum, char gender) {
        this.name = name;
        this.countrycode = countrycode;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(int countrycode) {
        this.countrycode = countrycode;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
