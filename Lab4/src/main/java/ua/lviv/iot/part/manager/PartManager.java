package ua.lviv.iot.part.manager;

import ua.lviv.iot.part.model.Part;
import ua.lviv.iot.part.model.TransmissionType;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PartManager implements IPart {

    private List<Part> part;

    public PartManager() {
    }

    public PartManager(final List<Part> part) {
        this.part = part;
    }

    public final List<Part> getPart() {
        return part;
    }

    public final void setPart(final List<Part> part) {
        this.part = part;
    }

    @Override
    public final void sortBySerialNumber(final List<Part> part, final boolean reverse) {
        if (reverse) {
            Collections.sort(part, Comparator.comparing(Part::getSerialNumber).reversed());
        } else {
            Collections.sort(part, Comparator.comparing(Part::getSerialNumber));
        }
    }

    @Override
    public final void sortByProducingCountry(final List<Part> part, final boolean reverse) {
        if (reverse) {
            Collections.sort(part, Comparator.comparing(Part::getProducingCountry).reversed());
        } else {
            Collections.sort(part, Comparator.comparing(Part::getProducingCountry));
        }
    }

    public final List<Part> findByProducingCountry(final TransmissionType transmissionType, final List<Part> findPartList) {

        return part.stream()
                .filter(devices -> devices.getTransmissionType() == transmissionType)
                .collect(Collectors.toList());
    }
}


