package com.chen.pojo;

import java.io.Serializable;
import java.util.Date;

public class AccountBook implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_book.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_book.date
     *
     * @mbggenerated
     */
    private String date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_book.incomeNm
     *
     * @mbggenerated
     */
    private String incomenm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_book.income
     *
     * @mbggenerated
     */
    private Double income;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_book.outcomeNm
     *
     * @mbggenerated
     */
    private String outcomenm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_book.outcome
     *
     * @mbggenerated
     */
    private Double outcome;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_book.stDate
     *
     * @mbggenerated
     */
    private Date stdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account_book
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_book.id
     *
     * @return the value of account_book.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_book.id
     *
     * @param id the value for account_book.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_book.date
     *
     * @return the value of account_book.date
     *
     * @mbggenerated
     */
    public String getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_book.date
     *
     * @param date the value for account_book.date
     *
     * @mbggenerated
     */
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_book.incomeNm
     *
     * @return the value of account_book.incomeNm
     *
     * @mbggenerated
     */
    public String getIncomenm() {
        return incomenm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_book.incomeNm
     *
     * @param incomenm the value for account_book.incomeNm
     *
     * @mbggenerated
     */
    public void setIncomenm(String incomenm) {
        this.incomenm = incomenm == null ? null : incomenm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_book.income
     *
     * @return the value of account_book.income
     *
     * @mbggenerated
     */
    public Double getIncome() {
        return income;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_book.income
     *
     * @param income the value for account_book.income
     *
     * @mbggenerated
     */
    public void setIncome(Double income) {
        this.income = income;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_book.outcomeNm
     *
     * @return the value of account_book.outcomeNm
     *
     * @mbggenerated
     */
    public String getOutcomenm() {
        return outcomenm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_book.outcomeNm
     *
     * @param outcomenm the value for account_book.outcomeNm
     *
     * @mbggenerated
     */
    public void setOutcomenm(String outcomenm) {
        this.outcomenm = outcomenm == null ? null : outcomenm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_book.outcome
     *
     * @return the value of account_book.outcome
     *
     * @mbggenerated
     */
    public Double getOutcome() {
        return outcome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_book.outcome
     *
     * @param outcome the value for account_book.outcome
     *
     * @mbggenerated
     */
    public void setOutcome(Double outcome) {
        this.outcome = outcome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_book.stDate
     *
     * @return the value of account_book.stDate
     *
     * @mbggenerated
     */
    public Date getStdate() {
        return stdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_book.stDate
     *
     * @param stdate the value for account_book.stDate
     *
     * @mbggenerated
     */
    public void setStdate(Date stdate) {
        this.stdate = stdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_book
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", incomenm=").append(incomenm);
        sb.append(", income=").append(income);
        sb.append(", outcomenm=").append(outcomenm);
        sb.append(", outcome=").append(outcome);
        sb.append(", stdate=").append(stdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}