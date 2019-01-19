package instruments;

public class ElectricGuitar extends Guitar {

    private int numberOfVolts;

    public ElectricGuitar(String modelName, String material, String colour, int boughtPrice, String instrumentNoise,
                          int numberOfStrings, int numberOfVolts) {
        super(modelName, material, colour, boughtPrice, instrumentNoise, numberOfStrings);
        this.numberOfVolts = numberOfVolts;
    }

    public int getNumberOfVolts() {
        return numberOfVolts;
    }
}
