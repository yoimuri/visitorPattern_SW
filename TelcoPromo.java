public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Smart(15, 500, false);
        TelcoSubscription globe = new Globe(10, 450, true);
        TelcoSubscription ditto = new Ditto(8, 400, true);

        TelcoVisitor promo = new TelcoAllowance();

        System.out.println("Smart Data Usage Offer and price: " + promo.showDataAllowance(smart.getTelcoName(), smart.getDataAllowance()) + ", " + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price: " + promo.showDataAllowance(globe.getTelcoName(), globe.getDataAllowance()) + ", " + promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price: " + promo.showDataAllowance(ditto.getTelcoName(), ditto.getDataAllowance()) + ", " + promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " + promo.showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " + promo.showUnliCallsTextOffer(globe.getTelcoName(), globe.getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " + promo.showUnliCallsTextOffer(ditto.getTelcoName(), ditto.getUnliCallText()));
    }
}