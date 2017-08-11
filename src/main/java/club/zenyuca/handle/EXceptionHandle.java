package club.zenyuca.handle;

import club.zenyuca.entity.Result;
import club.zenyuca.exception.GirlException;
import club.zenyuca.util.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class EXceptionHandle {

    @ExceptionHandler
    @ResponseBody
    public Result handle(GirlException e) {
        return ResultUtil.error(e.getCode(), e.getMessage());
    }
}
