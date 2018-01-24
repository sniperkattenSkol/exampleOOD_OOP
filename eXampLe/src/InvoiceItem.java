// Nils E Lindfors TE15
// 2017-10-25
// 14:56
public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPirce;

    public InvoiceItem(String id, String desc, int qty, double unitPirce){
        id = id;
        desc =desc;
        qty = qty;
        unitPirce = unitPirce;
    }
    public String getID(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int q){
       qty = q;
    }
    public double getUnitPirce(){
        return unitPirce;
    }
    public void setUnitPirce(double up){
         unitPirce = up;
    }
    public double getTotal(){
        return unitPirce*qty;
    }
    public String toString(){
        return "Employee[Id="+id+","+"Desc="+desc+","+"Qty="+qty+","+"UnitPrice="+unitPirce+"]";
    }


}
