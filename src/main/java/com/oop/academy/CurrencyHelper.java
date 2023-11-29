/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.academy;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author MSI
 */
public class CurrencyHelper {
    public static String convertToRupiah(int number) {
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp");
        formatRp.setMonetaryGroupingSeparator('.');
        formatRp.setMonetaryDecimalSeparator(',');

        rupiah.setDecimalFormatSymbols(formatRp);
        return rupiah.format(number);
    }
}
