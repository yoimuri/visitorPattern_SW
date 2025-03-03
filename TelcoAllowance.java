class TelcoAllowance implements TelcoVisitor {
    @Override
    public String showAllowance(String telcoName, int promoPrice) {
        return "Promo price for " + telcoName + ": " + promoPrice + " PHP";
    }

    @Override
    public String showDataAllowance(String telcoName, int dataAllowance) {
        return "Data allowance for " + telcoName + ": " + dataAllowance + " GB";
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean hasUnliCallText) {
        return "Unlimited calls and texts for " + telcoName + ": " + (hasUnliCallText ? "Yes" : "No");
    }
}