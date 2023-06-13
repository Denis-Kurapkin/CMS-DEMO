package ru.mag.prostor.repository;

import org.springframework.stereotype.Repository;
import ru.mag.prostor.model.entity.CompanyInfoEntity;

@Repository
public class CompanyInfoRepository {
    private final CompanyInfoEntity companyInfo;

    public CompanyInfoRepository(CompanyInfoEntity companyInfo) {
        this.companyInfo = companyInfo;
    }

    public CompanyInfoEntity getCompanyInfo() {
        return companyInfo;
    }
}
