
package tipper;

import java.text.NumberFormat;

/**
 * Getting ready to teach a Java class and in 2022 web based apps seems more reasonable than desktop applications, so using jsp pages for the GUI section.
 * Thus far I have been doing all of the testing on a Tomcat server running on xampp.
 * @author franc
 */
public class Bill {
    private Double price;
    private int satisfaction;
    private double percent;
    private int approxPercent;
    private double total;

    public Bill() {
    }

    public Bill(Double price, int satisfaction) {
        this.price = price;
        this.satisfaction = satisfaction;
        this.percent = (double)satisfaction / 350 + 0.03;
        this.approxPercent = (int)(percent * 100);
        this.total = price + price * percent;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public int getApproxPercent() {
        return approxPercent;
    }

    public void setApproxPercent(int approxPercent) {
        this.approxPercent = approxPercent;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    @Override
    public String toString(){
        return "I'd think a tip of about " + approxPercent + "% is reasonable...Which would make the total "+ totalString(); 
    }
    
    
    public String totalString(){
        NumberFormat cash = NumberFormat.getCurrencyInstance();
        return cash.format(total);
    }
}
