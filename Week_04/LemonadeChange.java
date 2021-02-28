package com.vipkid.tide.gw.web.arthmetic.week4;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/2/22 7:53 下午
 **/
public class LemonadeChange {


    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five ++;
            } else if (bill == 10) {
                five --;
                ten ++;
            } else if (bill == 20) {
                if (ten > 0) {
                    ten --;
                    five --;
                } else {
                    five -= 3;
                }
            }
            if (five < 0) {
                return false;
            }
        }
        return true;
    }




}
