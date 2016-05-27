package com.googlecode.easyec.wechat.msg.model.event;

import com.googlecode.easyec.wechat.msg.model.WeChatMessage;

/**
 * 微信事件消息对象类
 *
 * @author JunJie
 */
public class WeChatEventMessage extends WeChatMessage {

    public static final String ELEMENT_EVENT = "Event";
    public static final String MSG_TYPE_EVENT = "event";

    private String event;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
