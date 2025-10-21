public class Zad1_UserProfile_Malewski {
    private String username, email;
    public String getUsername() {return username;}
    public void setUsername(String u) {username = u;}
    public String getEmail() {return email;}
    public void setEmail(String e) {email = e;}
    public String describe() {return String.format("UserProfile{username='%s',email='%s'}",username,email);}

    public static void main(String[] args) {
        Zad1_UserProfile_Malewski profile1 = new Zad1_UserProfile_Malewski();
        profile1.setUsername("xaro");
        profile1.setEmail("abc@xyz.pl");
        System.out.println(profile1.getUsername());
        System.out.println(profile1.getEmail());
        System.out.println(profile1.describe());
    }
}
