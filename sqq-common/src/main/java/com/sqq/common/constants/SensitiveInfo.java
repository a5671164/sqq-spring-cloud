package com.sqq.common.constants;

import com.sqq.common.utils.SensitiveInfoUtils;

import java.lang.annotation.*;

/**
 * 敏感信息注解标记
 */
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface SensitiveInfo {

    SensitiveInfoUtils.SensitiveType type() ;
}
