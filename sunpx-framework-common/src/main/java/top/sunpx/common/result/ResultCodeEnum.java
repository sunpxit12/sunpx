package top.sunpx.common.result;

/**
 * @author :sunpx
 * @date :created in 2020/3/4 16:59
 * @desc :异常信息
 */
public enum  ResultCodeEnum {
    // 添加失败
    ADD_ERROR(1007, "ADD_ERROR!"),

    // 更新失败
    UPDATE_ERROR(1008, "UPDATE_ERROR!");

    private Integer code;

    private String message;


    ResultCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }



    public Integer getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }


}
