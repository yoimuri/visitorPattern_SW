interface TelcoVisitor {
    String showAllowance(String telcoName, int promoPrice);
    String showDataAllowance(String telcoName, int dataAllowance);
    String showUnliCallsTextOffer(String telcoName, boolean hasUnliCallText);
}