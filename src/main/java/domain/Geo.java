package domain;

public class Geo {
    private String type;
    private String coordinates;

    public void setType(String type) {
        this.type = type;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public String getCoordinates() {
        return coordinates;
    }
}
