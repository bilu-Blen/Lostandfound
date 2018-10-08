package me.Blen;

public class Item {
    private int itemId;
    private String name;
    private String catagory;
    private Boolean lost;


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public Boolean getLost() {
        return lost;
    }

    public void setLost(Boolean lost) {
        this.lost = lost;
    }
}
