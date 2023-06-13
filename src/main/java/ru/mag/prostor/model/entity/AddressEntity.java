package ru.mag.prostor.model.entity;

import org.springframework.stereotype.Component;

@Component
public class AddressEntity {
    private String city;
    private String street;
    private int houseNumber;
    private String building;
    private String mainPhoneNumber;
    private String secondPhoneNumber;

//    public AddressEntity(
//            String city,
//            String street,
//            int houseNumber,
//            String building,
//            String mainPhoneNumber,
//            String secondPhoneNumber) {
//        this.city = city;
//        this.street = street;
//        this.houseNumber = houseNumber;
//        this.building = building;
//        this.mainPhoneNumber = mainPhoneNumber;
//        this.secondPhoneNumber = secondPhoneNumber;
//    }

    public AddressEntity() {
        this.city = "Екатеринбург";
        this.street = "40 лет Октября";
        this.houseNumber = 29;
        this.building = null;
        this.mainPhoneNumber = "8 (343) 360-47-86";
        this.secondPhoneNumber = "+7 (953) 823-68-26";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getMainPhoneNumber() {
        return mainPhoneNumber;
    }

    public void setMainPhoneNumber(String mainPhoneNumber) {
        this.mainPhoneNumber = mainPhoneNumber;
    }

    public String getSecondPhoneNumber() {
        return secondPhoneNumber;
    }

    public void setSecondPhoneNumber(String secondPhoneNumber) {
        this.secondPhoneNumber = secondPhoneNumber;
    }
}
