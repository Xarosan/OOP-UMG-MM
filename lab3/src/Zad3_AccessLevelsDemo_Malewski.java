public class Zad3_AccessLevelsDemo_Malewski {
    public String publicName;
    protected int protectedId;
    String packageLevel;
    private String privateSecret;

    public String getPrivateSecret() {return privateSecret;}
    public void setPrivateSecret(String privateSecret) {this.privateSecret = privateSecret;}
    public String summary() {
        return String.format("publicName='%s'\n" +
                "protectedId='%d'\n" +
                "packageLevel='%s'\n" +
                "privateSecret='%s'",
                publicName,
                protectedId,
                packageLevel,
                privateSecret);
    }

    public static void main(String[] args) {
        Zad3_AccessLevelsDemo_Malewski ac = new Zad3_AccessLevelsDemo_Malewski();

        ac.publicName = "Malewski";
        ac.setPrivateSecret("zaq12wsx");
        System.out.println(ac.getPrivateSecret());
        ac.packageLevel = "abc";
        ac.protectedId = 7015;

        System.out.println(ac.summary());
    }


}
