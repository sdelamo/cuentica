/*
 * Copyright 2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cuentica;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Company {
    private String cif;

    private String tradename;

    private String business_name;

    private String name;

    @JsonProperty("surname_1")
    private String surnameFirst;

    @JsonProperty("surname_2")
    private String surnameSecond;

    private String address;

    @JsonProperty("postal_code")
    private String postalCode;

    private String town;

    private String region;

    @JsonProperty("country_code")
    private String countryCode;

    private String phone;

    private String email;

    private String web;

    private String fax;

    private String logo;

    private List<Serie> series;

    public Company() {

    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getTradename() {
        return tradename;
    }

    public void setTradename(String tradename) {
        this.tradename = tradename;
    }

    public String getBusiness_name() {
        return business_name;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnameFirst() {
        return surnameFirst;
    }

    public void setSurnameFirst(String surnameFirst) {
        this.surnameFirst = surnameFirst;
    }

    public String getSurnameSecond() {
        return surnameSecond;
    }

    public void setSurnameSecond(String surnameSecond) {
        this.surnameSecond = surnameSecond;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (cif != null ? !cif.equals(company.cif) : company.cif != null) return false;
        if (tradename != null ? !tradename.equals(company.tradename) : company.tradename != null) return false;
        if (business_name != null ? !business_name.equals(company.business_name) : company.business_name != null)
            return false;
        if (name != null ? !name.equals(company.name) : company.name != null) return false;
        if (surnameFirst != null ? !surnameFirst.equals(company.surnameFirst) : company.surnameFirst != null)
            return false;
        if (surnameSecond != null ? !surnameSecond.equals(company.surnameSecond) : company.surnameSecond != null)
            return false;
        if (address != null ? !address.equals(company.address) : company.address != null) return false;
        if (postalCode != null ? !postalCode.equals(company.postalCode) : company.postalCode != null) return false;
        if (town != null ? !town.equals(company.town) : company.town != null) return false;
        if (region != null ? !region.equals(company.region) : company.region != null) return false;
        if (countryCode != null ? !countryCode.equals(company.countryCode) : company.countryCode != null) return false;
        if (phone != null ? !phone.equals(company.phone) : company.phone != null) return false;
        if (email != null ? !email.equals(company.email) : company.email != null) return false;
        if (web != null ? !web.equals(company.web) : company.web != null) return false;
        if (fax != null ? !fax.equals(company.fax) : company.fax != null) return false;
        if (logo != null ? !logo.equals(company.logo) : company.logo != null) return false;
        return series != null ? series.equals(company.series) : company.series == null;
    }

    @Override
    public int hashCode() {
        int result = cif != null ? cif.hashCode() : 0;
        result = 31 * result + (tradename != null ? tradename.hashCode() : 0);
        result = 31 * result + (business_name != null ? business_name.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surnameFirst != null ? surnameFirst.hashCode() : 0);
        result = 31 * result + (surnameSecond != null ? surnameSecond.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (town != null ? town.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (web != null ? web.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        result = 31 * result + (series != null ? series.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "cif='" + cif + '\'' +
                ", tradename='" + tradename + '\'' +
                ", business_name='" + business_name + '\'' +
                ", name='" + name + '\'' +
                ", surnameFirst='" + surnameFirst + '\'' +
                ", surnameSecond='" + surnameSecond + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", town='" + town + '\'' +
                ", region='" + region + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", web='" + web + '\'' +
                ", fax='" + fax + '\'' +
                ", logo='" + logo + '\'' +
                ", series=" + series +
                '}';
    }
}
