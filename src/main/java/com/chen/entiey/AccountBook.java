package com.chen.entiey;

import java.util.Date;

public class AccountBook {
    private String chDay;
    private String incomeNm;
    private String outcomeNm;
    private Double income;
    private Double outcome;
    private Date stanDay;

    public AccountBook(String chDay, String incomeNm, String outcomeNm, Double income, Double outcome, Date stanDay) {
        this.chDay = chDay;
        this.incomeNm = incomeNm;
        this.outcomeNm = outcomeNm;
        this.income = income;
        this.outcome = outcome;
        this.stanDay = stanDay;
    }

    public AccountBook() {
    }

    public String getChDay() {
        return chDay;
    }

    public void setChDay(String chDay) {
        this.chDay = chDay;
    }

    public String getIncomeNm() {
        return incomeNm;
    }

    public void setIncomeNm(String incomeNm) {
        this.incomeNm = incomeNm;
    }

    public String getOutcomeNm() {
        return outcomeNm;
    }

    public void setOutcomeNm(String outcomeNm) {
        this.outcomeNm = outcomeNm;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double getOutcome() {
        return outcome;
    }

    public void setOutcome(Double outcome) {
        this.outcome = outcome;
    }

    public Date getStanDay() {
        return stanDay;
    }

    public void setStanDay(Date stanDay) {
        this.stanDay = stanDay;
    }

    @Override
    public String toString() {
        return "AccountBook{" +
                "chDay='" + chDay + '\'' +
                ", incomeNm='" + incomeNm + '\'' +
                ", income=" + income +
                ", outcomeNm='" + outcomeNm + '\'' +
                ", outcome=" + outcome +
                ", stanDay=" + stanDay +
                '}';
    }
}
