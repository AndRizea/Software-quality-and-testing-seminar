package csie.ase.ro.stage4;

import csie.ase.ro.stage4.marketing.IMarketingStrategy;

public class ProductDiscount {

    private IMarketingStrategy marketingStrategy;

    //dependency injection
    //setter injection
    public void setMarketingStrategy(IMarketingStrategy marketingStrategy) {
        this.marketingStrategy = marketingStrategy;
    }

    //constructor injection
    public ProductDiscount(IMarketingStrategy mkStrategy) {
        this.marketingStrategy = mkStrategy;
    }

    public float computePriceAndApplyDiscount(float price, ProductType type) {
        //callback
        if (this.marketingStrategy != null) {
            return marketingStrategy.computePriceAndApplyDiscount(price, type);
        } else {
            throw new UnsupportedOperationException("Missing marketing reference!");
        }
    }

    public float computeAccountDiscount(int accountAgeInYears) {
        if (this.marketingStrategy != null) {
            return this.marketingStrategy.computeAccountDiscount(accountAgeInYears);
        } else {
            throw new UnsupportedOperationException("Missing marketing reference!");
        }
    }

    public float getFinalPriceWithDiscount(ProductType productType, float price, int accountAgeInYears) {

        if (productType == ProductType.NEW) {
            return price;
        }

        float accountDiscount = computeAccountDiscount(accountAgeInYears);
        return computePriceAndApplyDiscount(price, productType) * (1 - accountDiscount);
    }
}
