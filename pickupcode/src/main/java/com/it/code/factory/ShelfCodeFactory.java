package com.it.code.factory;

import com.it.code.enums.ParamType;
import com.it.code.parameter.ParamSpec;
import com.it.code.styl.Code;
import com.it.code.styl.ShelfCode;

import java.util.List;
import java.util.Map;

public class ShelfCodeFactory implements PickupCodeFactory{
    private boolean isDoubleSided=false; //是否是双面货架
    private int layerCount =6; //最大层数
    private int perLayerPackageCount = 100;//每层最大包裹数
    private int shelfCount=6;//最大货架数
    @Override
    public Code getCode(int num) {
        /**
         * 默认为单面货架，一个货架有六层，一层最多放100个包裹，六个货架
         */
        //总共可以容纳的包裹
        int totalCount=0;
        //单个货架可以容纳的包裹数量
        int perShelfPackageCount=0;
        //取货码
        ShelfCode shelfCode=null;
        if(isDoubleSided){
            totalCount=2*layerCount*perLayerPackageCount*shelfCount;
            perShelfPackageCount=2*layerCount*perLayerPackageCount;
            if(num>totalCount){
                //todo 抛出异常
                return null;
            }
        }else{
            totalCount=layerCount*perLayerPackageCount*shelfCount;
            perShelfPackageCount=layerCount*perLayerPackageCount;
            if(num>totalCount){
                //todo 抛出异常
                return null;
            }
        }

        //获取货架号
        int shelfNum=(num-1)/perShelfPackageCount+1;
        //偏移位置
        int offsetInShelf=(num-1)%perShelfPackageCount;
        //层数
        int layerNum=offsetInShelf/perLayerPackageCount+1;
        String pickupCode=shelfNum+"-"+layerNum+"-"+num;
        shelfCode = new ShelfCode(pickupCode);
        return shelfCode;
    }

    @Override
    public String getName() {
        return "货架号-层-序号";
    }

    @Override
    public List<ParamSpec> getParamSpecs() {
        return List.of(new ParamSpec("isDoubleSided","货架类型 单面或者双面", ParamType.BOOLEAN),
                new ParamSpec("layerCount","单个货架的层数",ParamType.INT),
                new ParamSpec("perLayerPackageCount","单层最大包裹数量",ParamType.INT),
                new ParamSpec("shelfCount","货架数量",ParamType.INT));
    }

    @Override
    public void setParamSpecs(Map<String, Object> params) {
        if(params.containsKey("isDoubleSided")) this.isDoubleSided=(Boolean)params.get("isDoubleSided");
        if(params.containsKey("layerCount")) this.layerCount=(Integer)params.get("layerCount");
        if(params.containsKey("perLayerPackageCount"))this.perLayerPackageCount=(Integer)params.get("perLayerPackageCount");
        if(params.containsKey("shelfCount"))this.shelfCount=(Integer)params.get("shelfCount");
    }
}
