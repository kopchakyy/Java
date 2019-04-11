package ua.lviv.iot.part.model;

public abstract class Part {
    private int price;
    private ProducingCountry producingCountry;
    private PartType partType;
    private String serialNumber;
    private BrandName brandName;
    private TransmissionType transmissionType;

    public Part() {
    }

    public Part(final int price, final String serialNumber, final ProducingCountry producingCountry,
                final PartType partType, final BrandName brandName) {
        this.price = price;
        this.serialNumber = serialNumber;
        this.producingCountry = producingCountry;
        this.partType = partType;
        this.brandName = brandName;
    }

    public final String toString() {
        return "Part{"
                + " price " + price
                + " serialNumber " + serialNumber
                + " producingCountry " + producingCountry
                + "partType" + partType
                + "brandName" + brandName;
    }


    public final int getPricet() {
        return price;
    }


    public final void setPrice(final int price) {
        this.price = price;
    }


    public final String getSerialNumber() {
        return serialNumber;
    }

    public final void setSerialNumber(final String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public final ProducingCountry getProducingCountry() {
        return producingCountry;
    }

    public final void setProducingCountry(final ProducingCountry producingCountry) {
        this.producingCountry = producingCountry;
    }

    public final PartType getPartType() {
        return partType;
    }

    public final void setPartType(final PartType partType) {
        this.partType = partType;
    }

    public final BrandName getBrandName() {
        return brandName;
    }

    public final void setBrandName(final BrandName brandName) {
        this.brandName = brandName;
    }

    public final void setTransmissionType(final TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public final TransmissionType getTransmissionType() {
        return transmissionType;
    }
}
