package csie.ase.ro.stage4;

public enum ProductType {
    NEW(0.00f),
    SILVER(0.10f),
    GOLD(0.25f),
    PLATINUM(0.35f);

    float discount;

    ProductType(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return this.discount;
    }
}
