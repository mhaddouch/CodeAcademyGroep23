package Domain;

import java.util.Date;

public abstract class ContentItem {
    private int ContentItem;
    private Date date;
    private String status;

    public int getContentItem() {
        return ContentItem;
    }

    public void setContentItem(int contentItem) {
        ContentItem = contentItem;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPercentage(double percentage) {
        return percentage;
    }

}
