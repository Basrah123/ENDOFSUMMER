public class Data {
    //    Instance variables amount, unit, and downloadSpeed
    private int data_amount;
    private String unit_type;
    private int download_speed;
    private double converted_data;
    private double download_time;
    private double time_minutes;
    private double time_seconds;

    public int getData_amount() {
        return data_amount;
    }

    public String getUnit_type() {
        return unit_type;
    }

    public int getDownload_speed() {
        return download_speed;
    }

    public double getConverted_data() {
        return converted_data;
    }

    public double getTime_minutes() {
        return time_minutes;
    }

    public double getTime_seconds() {
        return time_seconds;
    }

    public double getDownload_time() {
        return download_time;
    }
    // setters bellow

    public void setData_amount(int data_amount) {
        this.data_amount = data_amount;
    }

    public void setUnit_type(String unit_type) {
        this.unit_type = unit_type;
    }

    public void setDownload_speed(int download_speed) {
        this.download_speed = download_speed;
    }

    public void setConverted_data(double converted_data) {
        this.converted_data = converted_data;
    }

    public void setTime_minutes(int time_minutes) {
        this.time_minutes = time_minutes;
    }

    public void setTime_seconds(int time_seconds) {
        this.time_seconds = time_seconds;
    }

    public void setDownload_time(double download_time) {
        this.download_time = download_time;
    }

    //    Constructor
    Data(int data_amount, String unit_type, int download_speed){
        setData_amount(data_amount);
        setUnit_type(unit_type);
        setDownload_speed(download_speed);

    }

    //    Class methods
    public short convertToMegabytes(){

        switch (getUnit_type()){
            case "bytes":
                setConverted_data(((double) getData_amount() / 1024) / 1024);
                break;
            case "kilobytes":
                setConverted_data((double) getData_amount() / 1024);
                break;
            case "megabytes":
                setConverted_data(getData_amount());
                break;
            case "gigabytes":
                setConverted_data(getData_amount() * 1024);
                break;
        }

        return (short) getConverted_data();
    }

    public double calculateDownloadTime(){
        setDownload_time(getConverted_data() / 1.25);
        return getDownload_time();

    }

    public int getFormattedDownloadTime(){
        setTime_minutes((int) (getConverted_data() / 1.25) / 60);
        setTime_seconds((int) (getConverted_data() / 1.25) % 60);

//        return (getTime_minutes() + "minutes" + getTime_seconds() + "seconds");
        return 0;
    }

    @Override
    public String toString(){
        return
                ("Data: " + (getData_amount()) + " " + getUnit_type()) +
                        ("\nDownload Time: " + getTime_minutes() + " minutes " + getTime_seconds() + " seconds");
    }


//    toString using Class methods
}

