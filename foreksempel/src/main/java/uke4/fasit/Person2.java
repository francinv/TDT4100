package uke4.fasit;

public class Person2 {

    private String fullName;
 
    public Person2(String fullName) {
       this.fullName = fullName;
    }
 
    public String getFullName() {
       return this.fullName;
    }
    public void setFullName(String fullName) {
       this.fullName = fullName;
    }
 
    public String getGivenName() {
       return this.fullName.substring(0, this.fullName.indexOf(' '));
    }
    public void setGivenName(String givenName) {
       this.fullName = givenName + " " + getFamilyName();
    }
 
    public String getFamilyName() {
       return this.fullName.substring(this.fullName.indexOf(' ') + 1);
    }
    
    public void setFamilyName(String familyName) {
       this.fullName = getGivenName() + " " + familyName;
    }

    public static void main(String[] args) {
      Person2 p2 = new Person2("Børge Haugset");
      System.out.println(p2.getFamilyName());
    }
 }
 