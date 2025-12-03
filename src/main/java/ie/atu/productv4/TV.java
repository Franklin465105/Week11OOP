package ie.atu.productv4;

public class TV extends Product {

    private String manufacturer;
    private int size;

    public TV() {
        super();
        manufacturer = "";
        size = 0;
        count++;
    }

   public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
   }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + manufacturer + "\nThe Size is " + size + "";
    }
}
