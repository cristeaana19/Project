package anasproject.hospitaldatabase.extraThings;



public class Address {
    private String country;
    private String city;
    private String streetName;
    private int houseNo;
    private String zipCode;

    //You need to validate a ZIP code (U.S. postal code), allowing both the five-digit and nine-digit (called ZIP+4) formats. The regex should match 12345 and 12345-6789, but not 1234, 123456, 123456789, or 1234-56789.
    public boolean validZipCode() {
        return this.zipCode.matches("^[0-9]{5}(?:-[0-9]{4})?$");
    }



    //TODO: implement the method to check if the value stored in the houseNo field is bigger than 1 and less then 100
    public boolean validateHouseNumber() {
        if (houseNo > 1 && houseNo < 100)
            return true;
        else
            return false;
    }
//    public int compareTo(Address number)
//    {
//        if(1 > number)
//            return 0;
//        if(number > 1)
//            return 1;
//        if(number > 100)
//            return 0;
//    }

    //TODO: implement the method to check if the value stored in the streetName field is starting with a capital letter and does not have any number
    public boolean validateStreetName() {
        return true;
    }

    public Address(String country, String city, String streetName, int houseNo, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetName = streetName;
        this.houseNo = houseNo;
        this.zipCode = zipCode;
    }
}


