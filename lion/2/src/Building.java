public class Building {
    protected String address;
    protected int floatNumber;
    protected BuildingTypeEnum type;

    public Building(String address, int floatNumber, BuildingTypeEnum type) {
        this.address = address;
        this.floatNumber = floatNumber;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", floatNumber=" + floatNumber +
                ", type=" + type +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloatNumber() {
        return floatNumber;
    }

    public void setFloatNumber(int floatNumber) {
        this.floatNumber = floatNumber;
    }

    public BuildingTypeEnum getType() {
        return type;
    }

    public void setType(BuildingTypeEnum type) {
        this.type = type;
    }
}
