/*
 * Copyright (c) 2020 Self-Order Kiosk
 */
package models;

import java.sql.Date;
import java.util.ArrayList;

public class Order {

  private int id;
  private int status;
  private Date date;
  private ArrayList<OrderDetail> details;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getStatus() {
    return this.status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public ArrayList<OrderDetail> getDetails() {
    return this.details;
  }

  public void setDetails(ArrayList<OrderDetail> details) {
    this.details = details;
  }

}