package immutable.order;

class Address {
    String country;
    String postalCode;
    String region;
    String streetAddress;

    public Address(final String country, final String postalCode, final String region, final String streetAddress) {
        this.country = country;
        this.postalCode = postalCode;
        this.region = region;
        this.streetAddress = streetAddress;
    }
}
