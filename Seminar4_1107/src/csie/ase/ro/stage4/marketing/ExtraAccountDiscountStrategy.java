package csie.ase.ro.stage4.marketing;

import csie.ase.ro.stage4.ProductType;

public class ExtraAccountDiscountStrategy implements IMarketingStrategy {

    @Override
    public float computeAccountDiscount(int accountAgeInYears) {
        return (accountAgeInYears > MIN_YEARS_FOR_MAX_DISCOUNT) ? ACCOUNT_MAX_DISCOUNT
                : (float) accountAgeInYears / 100;
    }

    @Override
    public float computePriceAndApplyDiscount(float price, ProductType type) {
        return price - (type.getDiscount() * price);
    }
}
