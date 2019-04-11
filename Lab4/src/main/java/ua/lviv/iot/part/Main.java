package ua.lviv.iot.part;


import java.util.ArrayList;
import java.util.List;
import ua.lviv.iot.part.manager.PartManager;
import ua.lviv.iot.part.model.Bloc;
import ua.lviv.iot.part.model.BrandName;
import ua.lviv.iot.part.model.Motor;
import ua.lviv.iot.part.model.Part;
import ua.lviv.iot.part.model.PartType;
import ua.lviv.iot.part.model.ProducingCountry;
import ua.lviv.iot.part.model.Transmission;
import ua.lviv.iot.part.model.TransmissionType;
import ua.lviv.iot.part.model.Type;
import ua.lviv.iot.part.model.Wheel;

public final class Main {
    private Main() {
    }

    public static void main(final String[] args) {

        PartManager manager = new PartManager();
        Motor motor = new Motor(100, "BC2209KO", ProducingCountry.JAPAN, PartType.MOTOR, BrandName.NISSAN, Type.DIESEL);
        Bloc bloc = new Bloc(140, "LO26039PO", ProducingCountry.USA, PartType.BLOC, BrandName.HONDA, "L");
        Wheel wheel = new Wheel(170, "PC270918LO", ProducingCountry.JAPAN, PartType.WHEEL, BrandName.LEXSUS, 4);

        //int numberOfGears, TransmissionType transmissionType

        Transmission transmission = new Transmission(
                155, "KO210374UA", ProducingCountry.CHINA, PartType.TRANSMISSION,
                BrandName.SUZUKI, 12, TransmissionType.AUTOMATIC);

        List<Part> listPart = new ArrayList();
        listPart.add(motor);
        listPart.add(bloc);
        listPart.add(wheel);
        listPart.add(transmission);

        manager.sortBySerialNumber(listPart, false);
        System.out.print(listPart);
        manager.sortByProducingCountry(listPart, false);
        System.out.print(listPart);
    }

}
