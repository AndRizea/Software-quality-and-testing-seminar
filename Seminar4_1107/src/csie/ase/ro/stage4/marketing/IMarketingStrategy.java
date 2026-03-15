package csie.ase.ro.stage4.marketing;

import csie.ase.ro.stage4.ProductType;

public interface IMarketingStrategy {
    public static final int MIN_YEARS_FOR_MAX_DISCOUNT = 10;
    public static final float ACCOUNT_MAX_DISCOUNT = 0.15f;

    float computeAccountDiscount(int accountAgeInYears);
    float computePriceAndApplyDiscount(float price, ProductType type);
}
