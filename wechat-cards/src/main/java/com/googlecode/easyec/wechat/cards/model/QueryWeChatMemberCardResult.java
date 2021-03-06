package com.googlecode.easyec.wechat.cards.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

/**
 * 查询微信卡券数据的对象类
 *
 */
@JsonInclude(NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryWeChatMemberCardResult {

    @JsonProperty("card")
    private QueryMemberCardInfo card;

    public QueryMemberCardInfo getCard() {
        return card;
    }

    public void setCard(QueryMemberCardInfo card) {
        this.card = card;
    }
}
