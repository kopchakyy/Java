package ua.lviv.iot.part.model;


public class Bloc extends Part {
    private String field;


    public Bloc() {
    }

    public Bloc(final int price, final String serialNumber, final ProducingCountry producingCountry,
                final PartType partType,
                final BrandName brandName, final String field) {
        super(price, serialNumber, producingCountry, partType, brandName);
        this.field = field;
    }

    public final String toString() {
        return super.toString()
                + " field " + field;
    }
    public final String getfield() {
        return field;
    }

    public final void setfield(final String field) {
        this.field = field;
    }
}
