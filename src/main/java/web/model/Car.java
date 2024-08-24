package web.model;
public class Car {
    private String model;
    private String color;
    private int yearofissue;
    public Car(){
    }
    public Car (String model, String color,int yearofissue){
        this.model = model;
        this.color = color;
        this.yearofissue = yearofissue;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYearofissue() {
        return yearofissue;
    }
    public void setYearofissue(int yearofissue) {
        this.yearofissue = yearofissue;
    }
@Override
public String toString() {
    return "Car{" +
            "model='" + model + '\'' +
            ", color='" + color + '\'' +
            ", yearofissue=" + yearofissue +
            '}';
    }
}