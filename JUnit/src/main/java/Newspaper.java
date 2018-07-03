public class Newspaper extends Item {

    private int id;
    private int barcode;
    private int issueNo;

    public Newspaper(int id, int barcode, int issueNo)
    {
        super(id);
        this.barcode = barcode;
        this.issueNo = issueNo;

    }


    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }


    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "id=" + id +
                ", barcode=" + barcode +
                ", issueNo=" + issueNo +
                '}';
    }
}
