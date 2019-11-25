package com.example.spring;

import java.util.Comparator;

public class StoreComparator implements Comparator<Store> {

    @Override
    public int compare(Store o1, Store o2) {
        int ret = 0;
        //店铺等级由高到低
        int sg = o2.getSgrade() - o1.getSgrade();
        if (sg != 0) {
            ret = sg > 0 ? 1 : -1;
        } else {
            //店铺距离由近及远
            sg = (o1.getDistance() - o2.getDistance()) > 0 ? 1 : -1;
            if (sg != 0) {
                ret = sg > 0 ? 1 : -1;
            }
        }
        return ret;
    }


}
