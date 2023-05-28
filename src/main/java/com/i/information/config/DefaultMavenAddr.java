package com.i.information.config;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Auther: peng
 * @Date: 2021/12/14 0014 13:13
 * @Description:
 */
public class DefaultMavenAddr {
    public static LinkedHashSet<String> addr=new LinkedHashSet<>();

    static {
        addr.add("https://maven.aliyun.com/repository/public");
        addr.add("https://mirrors.huaweicloud.com/repository/maven");
        addr.add("http://mirrors.cloud.tencent.com/nexus/repository/maven-public");
    }

}
