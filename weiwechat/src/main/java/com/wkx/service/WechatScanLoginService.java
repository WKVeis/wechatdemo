package com.wkx.service;

import com.wkx.pojo.AccessToken;
import com.wkx.pojo.WechatUserUnionID;

import java.util.Map;

/**
 * escription: 业务接口
 * Created by Administrator on 2018/11/24.
 */
public interface WechatScanLoginService {

    Map<String,String> wechatLoginUrl();

    AccessToken getAccessToken(String code);

    WechatUserUnionID getUserUnionID();

}
