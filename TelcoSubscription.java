abstract class TelcoSubscription {
    protected int dataAllowance;
    protected int promoPrice;
    protected String telcoName;
    protected boolean unliCallText;

    public TelcoSubscription(int dataAllowance, int promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    public abstract void accept(TelcoVisitor visitor);

    public int getDataAllowance() {
        return dataAllowance;
    }

    public int getPromoPrice() {
        return promoPrice;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }
}

class Smart extends TelcoSubscription {
    public Smart(int dataAllowance, int promoPrice, boolean unliCallText) {
        super(dataAllowance, promoPrice, "Smart", unliCallText);
    }

    @Override
    public void accept(TelcoVisitor visitor) {
        visitor.showAllowance(telcoName, promoPrice);
        visitor.showUnliCallsTextOffer(telcoName, unliCallText);
    }
}

class Globe extends TelcoSubscription {
    public Globe(int dataAllowance, int promoPrice, boolean unliCallText) {
        super(dataAllowance, promoPrice, "Globe", unliCallText);
    }

    @Override
    public void accept(TelcoVisitor visitor) {
        visitor.showAllowance(telcoName, promoPrice);
        visitor.showUnliCallsTextOffer(telcoName, unliCallText);
    }
}

class Ditto extends TelcoSubscription {
    public Ditto(int dataAllowance, int promoPrice, boolean unliCallText) {
        super(dataAllowance, promoPrice, "Ditto", unliCallText);
    }

    @Override
    public void accept(TelcoVisitor visitor) {
        visitor.showAllowance(telcoName, promoPrice);
        visitor.showUnliCallsTextOffer(telcoName, unliCallText);
    }
}