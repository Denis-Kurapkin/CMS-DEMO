package ru.mag.prostor.service.impl;

import org.springframework.stereotype.Service;
import ru.mag.prostor.convert.ModelDtoConverter;
import ru.mag.prostor.model.dto.template.AboutCompanyDto;
import ru.mag.prostor.repository.CompanyInfoRepository;
import ru.mag.prostor.service.AboutCompanyService;

@Service
public class AboutCompanyServiceImpl implements AboutCompanyService {
    private final CompanyInfoRepository companyInfoRepository;
    private final ModelDtoConverter modelConverter;

    public AboutCompanyServiceImpl(
            CompanyInfoRepository companyInfoRepository,
            ModelDtoConverter modelConverter) {
        this.companyInfoRepository = companyInfoRepository;
        this.modelConverter = modelConverter;
    }

    @Override
    public AboutCompanyDto getAboutCompany() {
        return modelConverter.convert(
                companyInfoRepository.getCompanyInfo()
        );
    }
}
