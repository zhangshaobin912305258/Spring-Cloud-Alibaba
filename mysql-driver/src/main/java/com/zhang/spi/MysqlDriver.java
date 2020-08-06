package com.zhang.spi;

public class MysqlDriver implements Driver{
    @Override
    public String connect() {
        return "连接MySQL数据库";
    }
}
