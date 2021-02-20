package com.jt.enums;

import lombok.Getter;


/**
 * @ClassName DataSourceEnum
 * @Description: TODO
 * @Author jt
 * @Date 2021/2/20/0020
 **/
@Getter
public enum DataSourceEnum {
    MASTER(1,"master"),
    SLAVE(2,"slave")
  ;

    private Integer code;
    private String desc;

    DataSourceEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getDesc(Integer v) {
        for (DataSourceEnum value : DataSourceEnum.values()) {
            if (value.getCode().equals(v)) {
                return value.getDesc();
            }
        }
        return "-";
    }

}