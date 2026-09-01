package com.it.code.factory;

import com.it.code.styl.Code;
import com.it.code.styl.ShelfCode;

public class ShelfCodeFactory implements PickupCodeFactory{
    @Override
    public Code getCode(int num) {
        /**
         * 默认为单面货架，一个货架有六层，一层最多放100个包裹
         */

        //获取货架号
        int shelfNum=(num-1)/600+1;
        //偏移位置
        int offsetInShelf = (num - 1) % 600;
        //层数
        int layerNum = offsetInShelf / 100 + 1;
        String pickupCode = shelfNum + "-" + layerNum + "-" + num;

        ShelfCode shelfCode = new ShelfCode(pickupCode);
        return shelfCode;
    }
}
