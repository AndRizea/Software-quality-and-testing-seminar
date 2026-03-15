package csie.ase.ro.stage4.test;

import csie.ase.ro.initial.Class1;
import csie.ase.ro.stage4.ProductType;
import csie.ase.ro.stage4.ProductDiscount;
import csie.ase.ro.stage4.marketing.ExtraAccountDiscountStrategy;
import csie.ase.ro.stage4.marketing.IMarketingStrategy;

public class TestApp {
    public static void main(String[] args){
        IMarketingStrategy currentStrategy = new ExtraAccountDiscountStrategy();
        ProductDiscount productDiscount = new ProductDiscount(currentStrategy);

        float finalPrice = productDiscount.getFinalPriceWithDiscount(ProductType.PLATINUM, 2000, 6);
        System.out.println("Final price (clean implementation): " + finalPrice);

        finalPrice = (new Class1()).Computes(4, 2000, 6);
        System.out.println("Final price (initial implementation): " + finalPrice);

}}
