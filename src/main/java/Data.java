public class Data {
//    Instance variables amount, unit, and downloadSpeed
    private double amount;
    private String unit;
    private int speed;



//    Constructor
    public Data(double amount, String unit, int speed) {
        this.amount = amount;
        this.unit = unit;
        this.speed = speed;
    }

//    Class methods
    public double convertToMegabytes() {
        double megabits = 0;
        switch (unit) {
            case "bytes":
                megabits = (amount / (1024 * 1024));
                break;
            case "kilobytes":
                megabits = amount / 1024;
                break;
            case "megabytes":
                megabits = amount * 1;
                break;
            case "gigabytes":
                megabits = amount * 1024;
                break;
            default:
                throw new IllegalArgumentException();
                    }
        return megabits;
    }
    public double calculateDownloadTime(){
        return (convertToMegabytes() / speed * 8);
    }

    public String getFormattedDownloadTime(){
        int minutes =(int) calculateDownloadTime() / 60;
        int secs =(int) calculateDownloadTime() % 60;
        return minutes + " minutes " + secs + " seconds";
    }

//    toString using Class methods
    @Override
    public String toString(){
        return "Data: " + amount + " " + unit + "\nDownload Time: " + getFormattedDownloadTime();
    }
}
