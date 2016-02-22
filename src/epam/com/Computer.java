package epam.com;

/**
 * Created by Любовь on 22.02.2016.
 */
public class Computer {
    private String manufacture;
    private int serialNumber;
    private int quantityCPU;
    private int frequencyCPU;
    private float price;


    public float res(){

        return price *10/100;
    }
    public void view() {
        System.out.println(getPrice() +" "+ getFrequencyCPU() +" "+ getQuantityCPU() +" "+ getSerialNumber()+ " "+ getManufacture());

    }
    public void setPrice(float price) {

        this.price = price;

    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public float getPrice() {
        return price;
    }


}
