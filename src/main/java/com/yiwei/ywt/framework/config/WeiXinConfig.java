package com.yiwei.ywt.framework.config;

/**
 * 微信配置类
 */
 public final class WeiXinConfig {

    /**
     * 开发者ID
     */
    public static final String APP_ID = "";

    /**
     * 密钥
     */
    public static final String APP_SECRET = "";

    /**
     * 微信获取code地址
     */
    public static final String CODE_URL = "https://open.weixin.qq.com/connect/oauth2/authorize?";

    /**
     * 获取ACCESS_TOKEN和OPENID
     */
    public static final String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/sns/oauth2/access_token?";
}