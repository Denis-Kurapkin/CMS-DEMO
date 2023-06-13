package ru.mag.prostor.model.dto.template;

import java.util.List;

public class AboutCompanyDto {
    private final List<String> descriptions;
    private final ContactDto contact;

    public AboutCompanyDto(List<String> descriptions, ContactDto contact) {
        this.descriptions = descriptions;
        this.contact = contact;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public ContactDto getContact() {
        return contact;
    }
}
