package com.it.code.factory;

import com.it.code.enums.ParamType;
import com.it.code.parameter.ParamSpec;
import com.it.code.styl.Code;
import com.it.code.styl.LayerCode;

import java.util.List;
import java.util.Map;

public class LayerCodeFactory implements PickupCodeFactory {
    private int layerCountParam = 6; //最大层数
    private int perLayerPackageCount = 100; //每层最大包裹数

    @Override
    public Code getCode(int num) {
        int packageCount = layerCountParam * perLayerPackageCount;
        if (num > packageCount) {
            //todo 抛异常
            return null;
        }
        int layerNum = (num - 1) / 100 + 1;
        LayerCode layerCode = new LayerCode(layerNum + "-" + num);
        return layerCode;
    }

    @Override
    public String getName() {
        return "层-序号";
    }

    @Override
    public List<ParamSpec> getParamSpecs() {
        return List.of(new ParamSpec("layerCountParam", "层数", ParamType.INT),
                       new ParamSpec("perLayerPackageCount", "每层最大包裹数",ParamType.INT));
    }

    @Override
    public void setParamSpecs(Map<String, Object> params) {
        if(params.containsKey("layerCountParam")) this.layerCountParam=(Integer) params.get("layerCountParam");
        if(params.containsKey("perLayerPackageCount")) this.perLayerPackageCount=(Integer) params.get("perLayerPackageCount");
    }
}
