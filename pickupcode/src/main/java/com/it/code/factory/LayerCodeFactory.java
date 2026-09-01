package com.it.code.factory;

import com.it.code.styl.Code;
import com.it.code.styl.LayerCode;

public class LayerCodeFactory implements PickupCodeFactory{
    @Override
    public Code getCode(int num) {
        //默认一层放100个包裹
        String pickupCode= (num-1)/100+1+"-"+num;
        LayerCode layerCode = new LayerCode(pickupCode);
        return layerCode;
    }
}
