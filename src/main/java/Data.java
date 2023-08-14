public class Data {
//    Instance variables amount, unit, and downloadSpeed
    private final double amount;
    private final String unit;
    private final double speed;

//    Constructor
    public Data(double amount, String unit, double speed){
        this.amount = amount;
        this.unit = unit;
        this.speed = speed;
    }

    public double convertToMegabytes() {
        return switch (unit.toLowerCase()) {
            case "bytes" -> amount / (1024 * 1024);
            case "kilobytes" -> amount / 1024;
            case "megabytes" -> amount;
            case "gigabytes" -> amount * 1024;
            case "terabytes" -> amount * 1024 * 1024;
            default -> throw new IllegalArgumentException("Unsupported unit: " + unit);
        };
    }

    public double calculateDownloadTime() {
        double megabytes = convertToMegabytes();

        // Calculate download time in seconds: time = size / speed
        return megabytes / (speed / (8)) ;
    }

    public String getFormattedDownloadTime() {
        double downloadTime = calculateDownloadTime();
        int minutes = (int) Math.floor(downloadTime / 60);
        int seconds = (int) Math.round(downloadTime % 60);

        return minutes + " minutes and " + seconds + " seconds";

    }
    @Override
    public String toString() {
        return "Amount: " + amount + " " + unit +
                "\nDownload Speed: " + speed + " Mbps\n"
                + "Download Time: " + getFormattedDownloadTime();
    }



//    Class methods


//    toString using Class methods
}
