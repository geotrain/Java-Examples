package model;

public abstract class InHouse extends Part {

    private int machineId;

    public InHouse(int PartId, String name, double price, int numInStock, int min, int max, int machineId) {
        setPartId(partId);
        setPartName(name);
        setPartPrice(price);
        setPartInStock(numInStock);
        setMin(min);
        setMax(max);
        this.machineId = machineId;
    }

    public int getMachineId() {

        return machineId;
    }

    public void setMachineId(int machineId) {

        this.machineId = machineId;
    }

}
