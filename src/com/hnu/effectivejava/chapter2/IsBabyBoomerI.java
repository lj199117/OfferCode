package com.hnu.effectivejava.chapter2;

import java.util.*;

public class IsBabyBoomerI {
    private final Date birthDate;

    public IsBabyBoomerI(Date birthDate) {
        // Defensive copy - see Item 39
        this.birthDate = new Date(birthDate.getTime());
    }

    // Other fields, methods omitted

    // DON'T DO THIS!
    /**
     * 每次调用这个方法的时候都要创建许多的对象,不可取，改进见II
     * @return
     */
    public boolean isBabyBoomer() {
        // Unnecessary allocation of expensive object
        Calendar gmtCal =
            Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = gmtCal.getTime();
        return birthDate.compareTo(boomStart) >= 0 &&
               birthDate.compareTo(boomEnd)   <  0;
    }
}
