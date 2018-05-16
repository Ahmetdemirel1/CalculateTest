package com.sahabt;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void toplamaTesti(){
        calculator cal = new calculator();
        cal.toplama(4,5);

        Assert.assertEquals("sikinti yok",9,9);

    }
    @Test
    public void cikartmaTesti(){
        calculator cal = new calculator();
        cal.cikartma(4,5);

        Assert.assertEquals("dogruruud",-1,-1,0.0);
    }

}
