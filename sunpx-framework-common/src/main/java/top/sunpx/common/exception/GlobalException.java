package top.sunpx.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import top.sunpx.common.result.ResultData;

/**
 * @author :sunpx
 * @date :created in 2020/3/4 16:53
 * @desc :全局异常处理
 */
@ControllerAdvice
@Slf4j
public class GlobalException {

    /**
     * @author      : sunpx
     * @desc        : 处理全局异常
     * @date        : top.sunpx.common.result.ResultData 17:02:07
     * @params      : e
     * @return      : top.sunpx.common.result.ResultData
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultData error(Exception e) {
        log.error(e.getMessage());
        return ResultData.getError();
    }


    /**
     * @author      : sunpx
     * @desc        : 处理自定义异常
     * @date        :  17:05:44
     * @params      : null
     * @return      :
     */
    @ExceptionHandler(GuliException.class)
    @ResponseBody
    public ResultData error(GuliException e){
        log.error(e.getMessage());
        return ResultData.getError(e.getCode(),e.getMessage());
    }
}
