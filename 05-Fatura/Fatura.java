public class Fatura {
    private String IdPart;
    private String Part;
    private int AmountPart;
    private double Price;

    public Fatura(String idPart, String part, int amountPart, double price){
        IdPart = idPart;
        Part = part;[]
        if(amountPart >= 0){
            AmountPart = amountPart;
        }
        else
            AmountPart = 0;

        if(price >= 0){
            Price = price;
        }
        else
            Price = 0;
    }

    public void setIdPart(String idPart) {
        IdPart = idPart;
    }

    public void setPart(String part) {
        Part = part;
    }

    public void setAmountPart(int amountPart) {
        if (amountPart >= 0) {
            AmountPart = amountPart;
        } else
            AmountPart = 0;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            Price = price;
        } else
            Price = 0;
    }

    public String getPart() {
        return Part;
    }

    public String getIdPart() {
        return IdPart;
    }

    public int getAmountPart() {
        return AmountPart;
    }

    public double getPrice() {
        return Price;
    }

    public double getValueInvoice() {
        return this.AmountPart * this.Price;
    }
}
