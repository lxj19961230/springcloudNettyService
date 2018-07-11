package springboot_demo.springcloud.handler;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
* 读取yml配置文件中的信息
* Created by lxj on 2017/10/31 - 18:38
*/
@Component
@ConfigurationProperties(prefix = "netty")
public class NettyConfig {

   private int port = 11111;
   

public int getPort() {
       return port;
   }

   public void setPort(int port) {
       this.port = port;
   }

}