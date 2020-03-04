package top.sunpx.common.result;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * APP接口参数返回类-app专用
 * @author yf
 * @date: 2019年08月22日 下午1:34:41
 *
 */
public class ResultData implements Serializable {
    private String msg;// 结果信息
    private Integer resultcode;// 代码 当值等于0时，为成功
    private Object resultdata = "";//结果集

    public ResultData(){super();}

    public ResultData(Integer code, String msg) {
        this.resultcode = code;
        this.msg = msg;
    }
    public ResultData(Object resultdata){
        this.resultdata = resultdata;
        this.resultcode = 0;
        this.msg = "ok";
    }

    public static ResultData getOK() {
        return new ResultData(0, "ok");
    }

    public static ResultData getOK(String msg) {
        return new ResultData(0, msg);
    }

    public static ResultData getOK(Integer code, String msg) {
        return new ResultData(code, msg);
    }

    public static ResultData getOK(Object value) {
        ResultData rs = ResultData.getOK();
        rs.putData(value);
        return rs;
    }

    public static ResultData getError() {
        return new ResultData(500, "error");
    }

    public static ResultData getError(String msg) {
        return new ResultData(500, msg);
    }
    /**
     * 返回错误object
     * @author yf 2018年11月18日 下午9:15:30
     * @param code
     * @param msg
     * @return
     */
    public static ResultData getError(Integer code, String msg) {
        return new ResultData(code, msg);
    }
    /**
     * 返回错误-array
     * @author yf 2018年11月18日 下午9:15:17
     * @param code
     * @param msg
     * @return
     */
    public static ResultData getErrorArray(Integer code, String msg) {
        ResultData rs = new ResultData(code, msg);
        List<Object> list = new ArrayList<>();
        rs.setResultdata(list);
        return rs;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getResultcode() {
        return resultcode;
    }

    public void setResultcode(Integer resultcode) {
        this.resultcode = resultcode;
    }

    public Object getResultdata() {
        return resultdata;
    }

    public void setResultdata(Object resultdata) {
        this.resultdata = resultdata;
    }

    public ResultData putData(Object obj) {
        if(obj!=null){
            this.resultdata = obj;
        }
        return this;
    }
}
