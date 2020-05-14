package zadania_4.zad7_autostrada;

import java.time.LocalDateTime;

public class VehicleInfo {
    private String numerRejestracyjnyPojazdu;
    private CarType carType;
    private LocalDateTime dataWjazdu;

    public VehicleInfo(String numerRejestracyjnyPojazdu, CarType carType) {
        this.numerRejestracyjnyPojazdu = numerRejestracyjnyPojazdu;
        this.carType = carType;
        this.dataWjazdu = LocalDateTime.now();
    }

    public String getNumerRejestracyjnyPojazdu() {
        return numerRejestracyjnyPojazdu;
    }

    public LocalDateTime getDataWjazdu() {
        return dataWjazdu;
    }

    public CarType getCarType() {
        return carType;
    }

    @Override
    public String toString() {
        return "VehicleInfo{" +
                "numerRejestracyjnyPojazdu='" + numerRejestracyjnyPojazdu + '\'' +
                ", carType=" + carType +
                ", dataWjazdu=" + dataWjazdu +
                '}';
    }
}
