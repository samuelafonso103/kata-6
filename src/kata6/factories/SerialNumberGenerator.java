package kata6.factories;

public class SerialNumberGenerator {
    private Integer serialNumber = 0;

    public SerialNumberGenerator() {
        this.serialNumber = serialNumber;
    }

    
    public Integer next(){
        return serialNumber++;
    }
}
