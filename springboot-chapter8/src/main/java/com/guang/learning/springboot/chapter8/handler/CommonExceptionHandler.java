package com.guang.learning.springboot.chapter8.handler;

import com.guang.learning.springboot.chapter8.exception.CommonException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@Slf4j
public class CommonExceptionHandler {

    /**
     * 拦截Exception类的异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> exceptionHandler(Exception e){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("respCode", "9999");
        result.put("respMsg", e.getMessage());
        //正常开发中，可创建一个统一响应实体，如CommonResp
        return result;

    }

    /**
     * 拦截 自定义CommonException 的异常
     * @param ex
     * @return
     */
    @ExceptionHandler(CommonException.class)
    @ResponseBody
    public Map<String,Object> exceptionHandler(CommonException ex){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("respCode", ex.getCode());
        result.put("respMsg", ex.getMsg());
        return result;
    }

    /**
     * 被@RequestBody修饰的参数校验异常处理类
     * @param ex
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public Map<String,Object> handleBindException(MethodArgumentNotValidException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("respCode", "7777");
        result.put("respMsg", fieldError.getDefaultMessage());
        return result;
    }

    /**
     * 除了@RequestBody修饰的参数校验异常处理类
     * @param ex
     * @return
     */
    @ExceptionHandler(BindException.class)
    @ResponseBody
    public Map<String,Object> handleBindException(BindException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("respCode", "8888");
        result.put("respMsg", fieldError.getDefaultMessage());
        return result;
    }



//    /**
//     * 对于返回页面时，返回ModelAndView即可
//     * @param req
//     * @param e
//     * @return
//     * @throws Exception
//     */
//    @ExceptionHandler(value = Exception.class)
//    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
//
//        ModelAndView mav = new ModelAndView();
//
//        mav.addObject("exception", e);
//
//        mav.addObject("url", req.getRequestURL());
//
//        mav.setViewName(DEFAULT_ERROR_VIEW);
//
//        return mav;
//
//    }

}
