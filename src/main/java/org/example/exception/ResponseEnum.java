package org.example.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author snail
 * @Title:
 * @Package
 * @Description:
 * @Company
 * @date 2020/8/13 10:59
 */

@Getter
@AllArgsConstructor
public enum ResponseEnum implements BusinessExceptionAssert{
    /**
     * Bad licence type
     */
    BAD_LICENCE_TYPE(7001, "Bad licence type."),
    /**
     * Licence not found
     */
    LICENCE_NOT_FOUND(7002, "Licence not found."),
    test(5002,"test");



    /**
     * 返回码
     */
    private int code;
    /**
     * 返回消息
     */
    private String message;
}
