public class Sale {
    public static void main(String[] args) {
        final int priceRubashka = 2000;
        final int viborRubashki = 6;
        final int kolichestvoDlySkidki = 10;
        final double sale = 0.5;

        final int dobavitRubashki = kolichestvoDlySkidki - viborRubashki;
        final int priceBezSkidki = priceRubashka * viborRubashki;
        final int obshyaPrice = kolichestvoDlySkidki * priceRubashka;
        final double allRubaskiSale = (viborRubashki * priceRubashka) * sale;
        final double oneRubaskiSale = priceRubashka * sale;
        final double econom = (priceRubashka * viborRubashki) - allRubaskiSale;
//        final double halyva =

        System.out.println("priceRubashka = " + priceRubashka);
        System.out.println("viborRubashki = " + viborRubashki);
        System.out.println("kolichestvoDlySkidki = " + kolichestvoDlySkidki);
        System.out.println("sale = " + sale);

        System.out.println("dobavitRubashki = " + dobavitRubashki);
        System.out.println("priceBezSkidki = " + priceBezSkidki);
        System.out.println("obshyaPrice = " + obshyaPrice);
        System.out.println("allRubaskiSale = " + allRubaskiSale);
        System.out.println("oneRubaskiSale = " + oneRubaskiSale);
        System.out.println("econom = " + econom);


    }
}
