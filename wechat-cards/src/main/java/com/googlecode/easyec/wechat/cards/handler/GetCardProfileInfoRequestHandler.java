package com.googlecode.easyec.wechat.cards.handler;

import com.googlecode.easyec.spirit.web.webservice.factory.StreamObjectFactory;
import com.googlecode.easyec.wechat.base.handler.AbstractWeChatHttpPostRequestHandler;
import com.googlecode.easyec.wechat.cards.model.GetCardProfileInfo;
import com.googlecode.easyec.wechat.cards.model.GetCardProfileInfoResult;
import com.googlecode.easyec.wechat.cards.model.GetUserCardList;
import com.googlecode.easyec.wechat.cards.model.GetUserCardListResult;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * 拉取卡券概况数据接口
 */
public class GetCardProfileInfoRequestHandler extends AbstractWeChatHttpPostRequestHandler<GetCardProfileInfoResult, GetCardProfileInfo> {

    public GetCardProfileInfoRequestHandler(StreamObjectFactory objectFactory, String baseUri, GetCardProfileInfo bean) {
        super(objectFactory, baseUri, bean);
    }

    @Override
    protected String createQueryString() throws IOException {
        return new StringBuffer()
                .append("access_token=")
                .append(getBean().getCredential().getAccessToken())
                .toString();
    }

    @Override
    protected HttpEntity createPostEntity() throws Exception {
        return new ByteArrayEntity(
                getObjectFactory().writeValue(getBean()),
                ContentType.create(
                        "text/json", Charset.forName("utf-8")
                )
        );
    }

    @Override
    protected String getBusinessUri() {
        return "/datacube/getcardbizuininfo";
    }
}
