public class XpaytoPayDAdapter implements PayD{
    private final Xpay xpay;
    public XpaytoPayDAdapter (Xpay xpay)
    {
        this.xpay = xpay;
    }

    public String getCreditCardNo()
    {
        return xpay.getCreditCardNo();
    }

    public String getCardOwnerName()
    {
        return xpay.getCustomerName();
    }

    public String getCardExpMonthYear()
    {
        return xpay.getCardExpMonth()+"/"+xpay.getCardExpYear();
    }

    public Integer getCVVNo()
    {
        return (int)xpay.getCardCVVNo();
    }

    public Double getTotalAmount()
    {
        return xpay.getAmount();
    }

    public void setCreditCardNo(String creditCardNo)
    {
        xpay.setCreditCardNo(creditCardNo);
    }

    public void setCardOwnerName(String cardOwnerName)
    {
        xpay.setCustomerName(cardOwnerName);
    }

    public void setCardExpMonthYear(String cardExpMonthYear)
    {
        xpay.setCardExpYear(cardExpMonthYear.substring(0,2));
        xpay.setCardExpMonth(cardExpMonthYear.substring(3,2));
    }

    public void setCVVNo(Integer cVVNo)
    {
        xpay.setCardCVVNo(cVVNo.shortValue());
    }

    public void setTotalAmount(Double totalAmount)
    {
        xpay.setAmount(totalAmount);
    }
}


