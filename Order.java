public class Order {

    private String item;
    private Integer quantity;
    private Double unitPrice;
    private Double totalAmount;
    private PaymentMode mode;

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public Order() {

    }

    public Order(String item, Integer quantity, Double unitPrice, PaymentMode mode) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.mode = mode;
        this.totalAmount = (quantity * unitPrice) - (mode.discount());
    }

    public void setItem(String item) {
        this.item = item;
    }
    public String getItem() {
        return item;
    }

    public void setQuantity() {
        this.quantity = quantity;
    }
    public Integer getQuantity() {
        return quantity;
    }

    public void setUnitPrice() {
        this.unitPrice = unitPrice;
    }
    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setTotalAmount() {
        Double amount = quantity * unitPrice;
        totalAmount =  amount - (mode.discount() * amount);
    }
    public Double getTotalAmount() {
        return totalAmount;
    }
}