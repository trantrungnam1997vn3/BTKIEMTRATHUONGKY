package nam.trung.tran.ttn_cau1;

public class FilmModel {
    public String name;
    public String country;
    public double price;

    public FilmModel(String name, String country, double price) {
        this.name = name;
        this.country = country;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
