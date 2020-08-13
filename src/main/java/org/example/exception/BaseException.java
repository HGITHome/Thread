package org.example.exception;

import lombok.Getter;

/**
 * @author snail
 * @Title:
 * @Package
 * @Description:
 * @Company
 * @date 2020/8/13 10:49
 */
@Getter
public class BaseException  extends RuntimeException{

     private int code ;

     private String messsage ;

     private IResponseEnum responseEnum;

    BaseException(IResponseEnum responseEnum, Object[] args, String message) {
        super(responseEnum.getMessage());
    }

    BaseException(IResponseEnum responseEnum, Object[] args, String message, Throwable cause) {
        super(responseEnum.getMessage());
    }
}
