package com.e.numbertowords;

public class NumToWordConverter {

    private int number;
    private String [] ones = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};
    private String [] twos = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public NumToWordConverter (int number)
    {
        this.number = number;
    }

    public String convert()
    {
        if(number<=20)
        {
            return ones[number];
        }
        else if(number<100)
        {
            return(twos[number/10] + " " + ones[number%10]);
        }
        else if(number<1000)
        {
            if(number%100==0)
            {
                return ones[number/100] + " Hundred";
            }
            else if(number%100<=20)
            {
                return ones[number/100] + " Hundred And " + ones[number%100];
            }
            else
            {
                return ones[number/100] + " Hundred And " + twos[(number%100)/10] + " " + ones[(number%10)%10];
            }
        }
        return "";
    }
}

