package com.deppon.test05.entity;

public class CustomerEntityKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customer.EI
     *
     * @mbg.generated
     */
    private Integer ei;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customer.CustomerID
     *
     * @mbg.generated
     */
    private String customerid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customer.EI
     *
     * @return the value of Customer.EI
     *
     * @mbg.generated
     */
    public Integer getEi() {
        return ei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customer.EI
     *
     * @param ei the value for Customer.EI
     *
     * @mbg.generated
     */
    public void setEi(Integer ei) {
        this.ei = ei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customer.CustomerID
     *
     * @return the value of Customer.CustomerID
     *
     * @mbg.generated
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customer.CustomerID
     *
     * @param customerid the value for Customer.CustomerID
     *
     * @mbg.generated
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }
}