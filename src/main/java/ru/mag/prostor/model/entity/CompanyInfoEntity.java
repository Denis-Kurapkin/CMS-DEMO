package ru.mag.prostor.model.entity;

import org.springframework.stereotype.Component;

@Component
public class CompanyInfoEntity {
    private AddressEntity address;
    private String description;

//    public CompanyInfoEntity(List<AddressEntity> addresses, String description) {
//        this.addresses = addresses;
//        this.description = description;
//    }

    public CompanyInfoEntity(AddressEntity address) {
        this.address = address;
        this.description = "Если Вы решили стать настоящим охотником, рыболовом " +
                "или туристом, то всё необходимое можно " +
                "приобрести в оружейном магазине «ПРОСТОР». На 200 кв. метрах торговых залов нашего магазина " +
                "представлено более 6000 наименований товара.\n" +
                "Наши консультанты, работая в области продаж товаров для охоты, рыбалки и туризма более 15 лет, " +
                "с радостью помогут Вам подобрать подарок для близкого человека в зависимости от его увлечений " +
                "или приобрести подарочные сертификаты.\n" +
                "У нас всегда большой ассортимент охотничьего, пневматического оружия и оружия самообороны " +
                "отечественных и зарубежных производителей, ножи Златоустовских, Кизлярских и Нижегородских " +
                "мастеров, патроны всех видов и калибров, оптические прицелы Leupold, Hakko, ВОМЗ и других " +
                "марок, бинокли Nikon, Olimpus, Veber, Leupold, дальномеры, тепловизоры, GPS-навигаторы, " +
                "рации, различные аксессуары и запчасти для оружия.\n" +
                "Большой выбор одежды и обуви на все сезоны, а также спальники, палатки, туристическая мебель.\n" +
                "В рыболовном отделе всегда в наличии надувные лодки: «REEF», «Сокол», лодочные моторы " +
                "GOLFSTREAM (PARSUN), спиннинги, удочки, катушки, ведущих производителей " +
                "(Shimano, Daiwa, Salmo), мормышки, ледобуры, рыболовные ящики, крючки, " +
                "поплавки электронные сигнализаторы клёва и эхолоты.\n";
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
