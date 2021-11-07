package Week9.P_10_12;

import java.util.Objects;

/**
 * Author: Lam Haoyin
 * GPG: C00E4E4FCC31CDF3
 * Date: 17:11 07/11/21
 * Project: JavaAssignments2021
 */

public class Invoice implements Payable {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

	public String getPartNumber() {
        return partNumber;
    }

	public String getPartDescription() {
        return partDescription;
    }

	public int getQuantity() {
        return quantity;
    }

	public double getPricePerItem() {
        return pricePerItem;
    }

	public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

	public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

	public void setQuantity(int quantity) {
		if (quantity < 0) {
			throw new IllegalArgumentException("Quantity must be greater than or equal to 0");
		}
        this.quantity = quantity;
    }

	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem < 0) {
			throw new IllegalArgumentException("Price per item must be greater than or equal to 0");
		}
        this.pricePerItem = pricePerItem;
    }

	public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

	@Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "invoice",
                "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(),
                "price per item", getPricePerItem());
    }

	@Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Invoice)) {
            return false;
        }
        Invoice invoice = (Invoice) o;
        return partNumber.equals(invoice.partNumber) &&
                partDescription.equals(invoice.partDescription) &&
                quantity == invoice.quantity &&
                Double.compare(pricePerItem, invoice.pricePerItem) == 0;
    }

	@Override
    public int hashCode() {
        return Objects.hash(partNumber, partDescription, quantity, pricePerItem);
    }

	@Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }

}
