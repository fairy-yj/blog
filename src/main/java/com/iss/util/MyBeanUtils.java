package com.iss.util;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

public class MyBeanUtils {

    /**
    *  获取所有的属性值为空属性名数组
    * */

    public static String[] getNullPropertyNames (Object source) {
        BeanWrapper beanWrapper = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = beanWrapper.getPropertyDescriptors();

        List<String> emptyNames = new ArrayList<>();
        for(PropertyDescriptor pd : pds) {
            String propertyName = pd.getName();
            if (beanWrapper.getPropertyValue(propertyName) == null){
                emptyNames.add(propertyName);
            }
        }
        return emptyNames.toArray(new String[emptyNames.size()]);
    }

}
