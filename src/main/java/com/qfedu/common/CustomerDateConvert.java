package com.qfedu.common;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 自定义转换器类，实现Converter接口，第一个泛型，待转换的数据的类型
// 第二个泛型，表示转换后的类型
public class CustomerDateConvert implements Converter<String, Date> {

    private SimpleDateFormat[] sdfs = new SimpleDateFormat[]{
            new SimpleDateFormat("yyyy-MM-dd" ),
            new SimpleDateFormat("yyyyMMdd"),
            new SimpleDateFormat("yyyy年MM月dd日")
    };


    @Nullable
    @Override
    public Date convert(String s) {

        if(s == null || s.isEmpty()){
            return null;
        }
        for(SimpleDateFormat sdf : sdfs){
            try {
                return sdf.parse(s);
            } catch (ParseException e) {
                continue;
            }
        }
        return null;
    }
}
