// Generated by the table tool compiler.  DO NOT EDIT!

package com.cyou.fusion.table.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TableLevelTarget {

     @JsonProperty("#Id")
     private int m#Id;
     @JsonProperty("Desc")
     private int mDesc;
     @JsonProperty("HenRootPos")
     private int mHenRootPos;
     @JsonProperty("EyasTotalCount")
     private int mEyasTotalCount;
     @JsonProperty("EyasMaxCount")
     private int mEyasMaxCount;
     @JsonProperty("EyasStartPosGroup")
     private int mEyasStartPosGroup;


     //#关卡ID     
     public int get#Id(){return this.m#Id;}
     //描述(不读)     
     public int getDesc(){return this.mDesc;}
     //母鸡初始位置（暂时废弃）     
     public int getHenRootPos(){return this.mHenRootPos;}
     //小鹰总数     
     public int getEyasTotalCount(){return this.mEyasTotalCount;}
     //小鹰同时出现的最大数量     
     public int getEyasMaxCount(){return this.mEyasMaxCount;}
     //小鹰开始出生的位置，需要和出生点对应，不填默认为所有出生点都出生     
     public int getEyasStartPosGroup(){return this.mEyasStartPosGroup;}


}