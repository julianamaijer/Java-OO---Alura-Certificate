public class CalculateTax implements Taxable {

    private double totalTaxes;

    public void register(Taxable taxable){
        double value = taxable.getTaxValue();
        this.totalTaxes += value;
    }

    public double getTaxValue() {
        return totalTaxes;
    }
}
