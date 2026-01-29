package language;

import java.util.Date;

class Reservation {
    private Date startDate;
    private Date endDate;
    private String customerName;

    public Reservation(Date startDate, Date endDate, String customerName) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerName = customerName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void sendConfirmationEmail() {

    }
}