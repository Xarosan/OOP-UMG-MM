public class Zad4_WriteOnlySettings_Malewski {
    private int volume;
    private boolean darkMode;
    public void setVolume(int volume) {this.volume = volume;}
    public void setDarkMode(boolean darkMode) {this.darkMode = darkMode;}
    public String describe() {return String.format("Settings{volume=%d,darkMode=%b}",volume,darkMode);}


    public static void main(String[] args) {
        Zad4_WriteOnlySettings_Malewski settings = new Zad4_WriteOnlySettings_Malewski();

        settings.setVolume(50);
        settings.setDarkMode(true);
        System.out.println(settings.describe());

        settings.setVolume(13);
        settings.setDarkMode(true);
        System.out.println(settings.describe());

        settings.setVolume(100);
        settings.setDarkMode(false);
        System.out.println(settings.describe());
    }
}
