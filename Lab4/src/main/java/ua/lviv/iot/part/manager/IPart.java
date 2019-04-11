package ua.lviv.iot.part.manager;
import java.util.List;

import ua.lviv.iot.part.model.Part;

public interface IPart {
    void sortByProducingCountry(List<Part> part, boolean reverse);

    void sortBySerialNumber(List<Part> part, boolean reverse);
}
