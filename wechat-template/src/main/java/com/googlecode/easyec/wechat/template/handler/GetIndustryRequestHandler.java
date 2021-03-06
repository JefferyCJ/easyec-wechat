package com.googlecode.easyec.wechat.template.handler;

import com.googlecode.easyec.spirit.web.webservice.factory.StreamObjectFactory;
import com.googlecode.easyec.wechat.base.handler.AbstractWeChatHttpGetRequestHandler;
import com.googlecode.easyec.wechat.template.model.GetIndustryEntityResult;
import com.googlecode.easyec.wechat.template.model.GetIndustryValue;

/**
 * Created by 平功元 on 2016/4/26.
 */
public class GetIndustryRequestHandler extends AbstractWeChatHttpGetRequestHandler<GetIndustryEntityResult, GetIndustryValue> {
    public GetIndustryRequestHandler(StreamObjectFactory objectFactory, String baseUri, GetIndustryValue bean) {
        super(objectFactory, baseUri, bean);
    }

    @Override
    protected String createQueryString() {
        return new StringBuffer()
                .append("access_token=")
                .append(getBean().getCredential().getAccessToken()).toString();

    }

    @Override
    protected String getBusinessUri() {
        return "/cgi-bin/template/get_industry";
    }
}
