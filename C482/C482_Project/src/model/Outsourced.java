package model;

import java.util.Collection;

/**
 * @author gregwest
 */

public abstract class Outsourced extends Part {

    private String companyName;

    public Outsourced(int PartID, String name, double price, int numInStock, int min, int max, String companyName) {
        setPartId(partId);
        setPartName(name);
        setPartPrice(price);
        setPartInStock(numInStock);
        setMin(min);
        setMax(max);
        setCompanyName(companyName);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String name) {
        this.companyName = name;
    }


}
