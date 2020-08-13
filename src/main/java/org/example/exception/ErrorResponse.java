package org.example.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author snail
 * @Title:
 * @Package
 * @Description:
 * @Company
 * @date 2020/8/13 14:44
 */

@Getter
@AllArgsConstructor
public class ErrorResponse implements Serializable {

    private Integer code;

    private String message;


}
