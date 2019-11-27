package io.jpress.model;

import io.jboot.db.annotation.Table;
import io.jpress.model.base.BaseUserAmountPayout;

import java.util.HashMap;
import java.util.Map;

/**
 * Generated by JPress.
 */
@Table(tableName = "user_amount_payout", primaryKey = "id")
public class UserAmountPayout extends BaseUserAmountPayout<UserAmountPayout> {

    private static final long serialVersionUID = 1L;

    //提现中
    public static final int STATUS_APPLYING = 1;

    //回绝提现
    public static final int STATUS_REFUSE = 2;

    //提现成功
    public static final int STATUS_SUCCESS = 9;

    public static final Map<Integer, String> statusTexts = new HashMap<>();

    static {
        statusTexts.put(STATUS_APPLYING, "提现中");
        statusTexts.put(STATUS_REFUSE, "拒绝提现");
        statusTexts.put(STATUS_SUCCESS, "提现成功");
    }


    public static final String PAY_TYPE_ALIPAY = "alipay";
    public static final String PAY_TYPE_WECHAT = "wechat";
    public static final String PAY_TYPE_BOC = "boc";
    public static final String PAY_TYPE_ABC = "abc";
    public static final String PAY_TYPE_ICBC = "icbc";
    public static final String PAY_TYPE_CCB = "ccb";
    public static final String PAY_TYPE_BANKCOMM = "bankcomm";
    public static final String PAY_TYPE_CMB= "cmb";
    public static final String PAY_TYPE_OTHERBANK = "otherbank";

    public static final Map<String, String> payTypeTexts = new HashMap<>();
    static {
        payTypeTexts.put(PAY_TYPE_ALIPAY,"支付宝账号");
        payTypeTexts.put(PAY_TYPE_WECHAT,"微信账号");
        payTypeTexts.put(PAY_TYPE_BOC,"中国银行");
        payTypeTexts.put(PAY_TYPE_ABC,"农业银行");
        payTypeTexts.put(PAY_TYPE_ICBC,"工商银行");
        payTypeTexts.put(PAY_TYPE_CCB,"建设银行");
        payTypeTexts.put(PAY_TYPE_BANKCOMM,"交通银行");
        payTypeTexts.put(PAY_TYPE_CMB,"招商银行");
        payTypeTexts.put(PAY_TYPE_OTHERBANK,"其他银行");
    }


    public String getStatusStr() {
        return statusTexts.get(getStatus());
    }

    public String getPayTypeStr() {
        return payTypeTexts.get(getPayType());
    }

    public boolean isApplying(){
        return STATUS_APPLYING == getStatus();
    }

    public boolean isRefuse(){
        return STATUS_REFUSE == getStatus();
    }


    public boolean isSuccess(){
        return STATUS_SUCCESS == getStatus();
    }
}
