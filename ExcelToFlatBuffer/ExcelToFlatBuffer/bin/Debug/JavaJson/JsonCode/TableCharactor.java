// Generated by the table tool compiler.  DO NOT EDIT!

package com.cyou.fusion.table.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TableLevelTarget {

     @JsonProperty("#Id")
     private int m#Id;
     @JsonProperty("Desc")
     private int mDesc;
     @JsonProperty("Model")
     private int mModel;
     @JsonProperty("PositionX")
     private int mPositionX;
     @JsonProperty("PositionY")
     private int mPositionY;
     @JsonProperty("PositionZ")
     private int mPositionZ;


     //#ID     
     public int get#Id(){return this.m#Id;}
     //描述(不读)     
     public int getDesc(){return this.mDesc;}
     //状态的模型Id     
     public int getModel(){return this.mModel;}
     //角色初始位置（X、Y、Z）     
     public int getPositionX(){return this.mPositionX;}
     //     
     public int getPositionY(){return this.mPositionY;}
     //     
     public int getPositionZ(){return this.mPositionZ;}


}