package com.googlecode.easyec.wechat.cards.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

/**
 * 表示微信卡券中的兑换券类型的对象类
 *
 * @author JunJie
 */
@JsonInclude(NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeChatGift extends AbstractWeChatCard<WeChatCardInfo> {

    private static final long serialVersionUID = -3639277371473351262L;
    @JsonProperty
    private String gift;  // 填写兑换内容的名称

    protected WeChatGift() {
        super(new WeChatCardInfo());
        setCardType("GIFT");
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    @Override
    @JsonProperty("gift")
    public WeChatCardInfo getCardInfo() {
        return null;
    }
}
