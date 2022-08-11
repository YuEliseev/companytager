package com.yuEliseev.companytager.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompanyDTO {

    private String companyName;
    private String indeedTag;
    private String yahooTag;
    private String mergedTag = indeedTag + ", " + yahooTag;

    @Override
    public String toString() {
        return String.format("Company [name = '%s', merged tag = '%s', indeed tag = '%s', yahoo tag = '%s']",
                companyName,mergedTag,indeedTag,yahooTag);
    }
}
