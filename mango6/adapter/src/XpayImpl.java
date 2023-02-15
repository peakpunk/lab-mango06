public class XpayImpl implements Xpay {
    private String cNo;
    private String customerName;
    private String cExpMonth;
    private String cExpYear;
    private Short cCVVNo;
    private Double amount;
    @Override
    public String getCreditCardNo() { return cNo; }
    @Override
    public void setCreditCardNo(String cNo) { this.cNo = cNo; }
    // getters and setters


    @Override
    public String getCustomerName () {
        return this.customerName;
    }

    @Override
    public void setCustomerName (String _customerName){
        this.customerName = _customerName;
    }

    @Override
        public String getCardExpMonth () {
        return this.cExpMonth;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cExpMonth = cardExpMonth;
    }

    @Override
    public String getCardExpYear() {
        return this.cExpYear;
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cExpYear = cardExpYear;
    }

    @Override
    public Short getCardCVVNo() {
        return this.cCVVNo;
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.cCVVNo = cardCVVNo;
    }

    @Override
    public Double getAmount() {
        return this.amount;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }


}

