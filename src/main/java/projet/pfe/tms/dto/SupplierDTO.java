package projet.pfe.tms.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDTO {
    @Getter
    private String company;
    private String phoneNumber;
    @Getter
    private String country;
    private String city;
    private String zip;
    private String state;
    private String address;
    private String website;
    @Getter
    private String currencyCode;
    private String codeAuxi;
 //   private List<SupplierContact> supplierContactList;


    public void setCountry(String country) {
        this.country = country;
    }

    public void setCurrencyCode(String currencyCode) {
       this.currencyCode = currencyCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
}
