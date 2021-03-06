package com.gvozdev.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config.property")
public class ApplicationConfig {

    @Value("${http.port}")
    private int port;

    @Value("${tcp.dest.addr}")
    private String destAddr;

    @Value("${tcp.dest.port}")
    private int destPort;

    public ApplicationConfig() {
    }

    public ApplicationConfig(int port, String destAddr, int destPort) {
        this.port = port;
        this.destAddr = destAddr;
        this.destPort = destPort;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDestAddr() {
        return destAddr;
    }

    public void setDestAddr(String destAddr) {
        this.destAddr = destAddr;
    }

    public int getDestPort() {
        return destPort;
    }

    public void setDestPort(int destPort) {
        this.destPort = destPort;
    }
}
