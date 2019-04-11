package ua.lviv.iot.part.model;

public class Transmission extends Part {
    private int numberOfGears;
    private TransmissionType transmissionType;

    public Transmission() {
    }

    public Transmission(final int price, final String serialNumber, final ProducingCountry producingCountry,
                        final PartType partType, final BrandName brandName, final int numberOfGears, final TransmissionType transmissionType) {
        super(price, serialNumber, producingCountry, partType, brandName);
        this.numberOfGears = numberOfGears;
        this.transmissionType = transmissionType;
    }

    public final String toString() {
        return super.toString()
                + " numberOfGears" + numberOfGears
                + "transmissionType" + transmissionType;
    }

    public final int getNumberOfGears() {
        return numberOfGears;
    }

    public final void setNumberOfGears(final int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public final TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public final void setTransmissionType(final TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }
}

