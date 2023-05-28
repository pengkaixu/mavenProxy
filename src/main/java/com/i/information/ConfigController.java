package com.i.information;

import com.i.information.config.DefaultMavenAddr;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: peng
 * @Date: 2021/12/14 0014 14:39
 * @Description:
 */
@Controller
public class ConfigController {
    @RequestMapping("/setMaven")
    @ResponseBody
    public Object setMaven(String add,String del){
        StringBuilder sb=new StringBuilder();
        if(add!=null&&
                (add.startsWith("http://")||add.startsWith("https://"))){
            if(DefaultMavenAddr.addr.add(add)){
                sb.append("add one \r\n");
            }
        }
        if(del!=null&&
                (del.startsWith("http://")||del.startsWith("https://"))){
            if(DefaultMavenAddr.addr.remove(del)){
                sb.append("del one \r\n");
            }
        }
        return sb.toString();
    }
}
