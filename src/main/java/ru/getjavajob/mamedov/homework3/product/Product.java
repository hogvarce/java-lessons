package ru.getjavajob.mamedov.homework3.product;


import ru.getjavajob.mamedov.homework3.annotations.*;

/**
 * Created by Ganzhenko on 22.09.2016.
 */
public class Product {
    @NotNull
    @NotEmpty
    private String title;
    @Min(min = 0)
    @LessThan(fieldName = "countOnStorage")
    private int count;
    @Min(min = 0)
    private int countOnStorage;
    @Min(min = 0)
    private double price;
    private double sale;
    @NotNull
    @NotEmpty
    @Uppercase
    private String customerId;
    @NotNull
    @NotEmpty
    private String customerEmail;
    @NotNull
    @NotEmpty
    private String customerPhone;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCountOnStorage() {
        return countOnStorage;
    }

    public void setCountOnStorage(int countOnStorage) {
        this.countOnStorage = countOnStorage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

}
