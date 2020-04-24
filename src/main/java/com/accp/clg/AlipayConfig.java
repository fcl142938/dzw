package com.accp.clg;
/**
 * @author zhaoliancan
 * @description 配置类 * @create 2019-08-08 18:50
 */

public class AlipayConfig {



    // 作为身份标识的应用ID
    public static String app_id = "2016102200737141";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key  ="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCQ7dZNbLh2rAX92fwYiozXlarzOI0RXkravo+pgXpSWOSqSUbAxpgDreOYM5CfrAbK59ThIuwikOdV3fyvXd/dQthpxuEPCg90PDIJpQfrk1sFdvPgdrDZ49wrTNv5WAqSitohBsbJlL0iDnMS2r5jA/3CqMqfy2mXSGFAbbmkrqB5EohF9lf+Ad6nvcJkTW0L96XxniIre4oKJOp/r1Jb3v0KEmDFibEzmBgvGy1SjhErCuYlCnpgtY1lp6vf7ugFx6DJbXBNz9sdzVzSGzTnAJ55KNzjf12eW5AZWmmJZibfr2ylXCkUUDKDgFU5ZQAwY9kIQmZgpKBWwQtYobirAgMBAAECggEAEBzA9H6fy2G4kM5JPpk4q0cSaFPjKwkmnUcORbQFW15SnbPjz87EW7RbVzJ0Y6wGXUyE2Dq/seAWN++kBgMTvk+OK8RWhQuDSFLg5T2ZsdECD4t39X58jtzMP2weEIx/MGeLdJyCQSruE/kzRedXvz5UWe3WCQneRVlgpn8MYoh0YaY+zlIJkKWvTsyIJhXnv5nE1ZxDpZBMYbMJhj/sk3/41A8bplUUgx2C4+y1WB3wwXZGMKbsUbdQfLZ7TC3nestgCz+05AxyZX/XFP8J8tV0cbIdyHXQFkoGDMZzKSupQnFZisNNKVBmffTu2X6JTwSvT7XC/f2bToPb+JjFAQKBgQDY0uU2Fh6eE+RYpM2uPVlkkjFUlIMFs0lp76sZwkmrQK610lmpUtP3Pv0tLzWYK0LWlpeOLLVC/n7oPyqK09ANO9kN4P6HlLj1jirDa80m/IoMapoCMLTqHoV0zS5K5BW4sIX24bzsJ3MJ41DctDPsfxTdT7I8kV+8cnX00dl4wQKBgQCrHXn4tgg3v0aiUGIGtWRnSiW7SPg2Vee1pEyWcHgI8dl7Jbv1loXXdnduN37w+Dym48BNrYZNWzL73V9DYxMhmSIfteqnGQidrMokTCjY73kyKm+sBIf0cccydYt7EQMLzNSSgFeiPElQURRjSH+czvaj3gzw9+925WBu+4xAawKBgDD9tfy6ksB1DitZUYAFLKWkwrCxvckT8YqWNLrlQ3AGdXNvzAKOTIaZHOuQtzNi0v9Zl3TwdSRmDJa9bwdfRKs40ppoNBq+Z+xT6yWsvfYJKcgUbigAiWA89TqnAca6Mo5AlIRsDRvu7fdV/Xdg4DqXnEdFMqis0EzsL+rZX6IBAoGBAKpCPQ+sSAb4ClcMtkzIheuESoDMPTULSu9gWFhD9huoUOYIiLn3GJtno7QGAgfQZ8EC0mA37W7g9JzJCrWpSerfTKXSw3WaIgmJWOS+5tHbjXLN6Kl3JLOj1jkt3igIqEhAea5/hzLE24nP8wJKq7ch8yTfl27Ys+tQliA3qLibAoGAXxydcBDtcFL5D9vUWaCCXJWG7+B0WOwpab52UCUReMpgEy9xA/LYFM8awvvjl1RW8Jnj5rR7gS+0bb+IP8Crwo7YKh1AcbZFQqtJ+L2LwoCSz4/sE/0PCceJQj18Vo4Cme7RtLrV59EIKtmPuNbQtLMlN7mVvn78uVr9WSkTZPA=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkO3WTWy4dqwF/dn8GIqM15Wq8ziNEV5K2r6PqYF6UljkqklGwMaYA63jmDOQn6wGyufU4SLsIpDnVd38r13f3ULYacbhDwoPdDwyCaUH65NbBXbz4Haw2ePcK0zb+VgKkoraIQbGyZS9Ig5zEtq+YwP9wqjKn8tpl0hhQG25pK6geRKIRfZX/gHep73CZE1tC/el8Z4iK3uKCiTqf69SW979ChJgxYmxM5gYLxstUo4RKwrmJQp6YLWNZaer3+7oBcegyW1wTc/bHc1c0hs05wCeeSjc439dnluQGVppiWYm369spVwpFFAyg4BVOWUAMGPZCEJmYKSgVsELWKG4qwIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://127.0.0.1:8020/Project/menu.html";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://127.0.0.1:8020/Project/menu.html";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
}
/**java
<a name="K2alt"></a>
### 三.开发Controller及接口调用代码

1. 使用Restful定义调用接口，通过postman或浏览器输入[http://localhost:8080/payment/pay](http://localhost:8080/payment/pay)直接调用支付接口
```java
*/
