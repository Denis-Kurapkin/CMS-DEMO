package ru.mag.prostor.model.dto.template;

public class ContactDto {
    private final String address;
    private final String mainPhoneNumber;
    private final String secondPhoneNumber;

    public ContactDto(String address, String mainPhoneNumber, String secondPhoneNumber) {
        this.address = address;
        this.mainPhoneNumber = mainPhoneNumber;
        this.secondPhoneNumber = secondPhoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getMainPhoneNumber() {
        return mainPhoneNumber;
    }

    public String getSecondPhoneNumber() {
        return secondPhoneNumber;
    }
}
