package com.vinod;

public class Switch
{
    public static void mainf()
    {
        int day = 4;
        switch (day)
        {
            case 6 :                                        //if day == 6 do case 6
                System.out.println("Today is Saturday");
                break;
            case 7 :                                        //if day == 7 do case 7
                System.out.println("Today is Sunday");      
                break;
            default :
                System.out.println("Looking forward to the Weekend");     //else
        }
    }
}
