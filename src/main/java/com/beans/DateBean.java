/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beans;

import java.util.Date;

/**
 *
 * @author msrapunzel
 */
public class DateBean {

    private Date currentDate;

    public DateBean() {
        currentDate = new Date();
    }

    public Date getCurrentDate() {
        return currentDate;
    }
}
