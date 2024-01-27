package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.stereotype.Component;

@Component
public class ServerInfoProvider {

    private final ServerProperties serverProperties;

    @Autowired
    public ServerInfoProvider(ServerProperties serverProperties) {
        this.serverProperties = serverProperties;
    }

    public void printServerInfo() {
        int port = serverProperties.getPort();
        String address = serverProperties.getAddress().getHostAddress();

        System.out.println("Server is running at: http://" + address + ":" + port);
    }
}
