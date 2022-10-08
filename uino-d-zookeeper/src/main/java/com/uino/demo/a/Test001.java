package com.uino.demo.a;

import java.io.IOException;

import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.client.HostProvider;
import org.apache.zookeeper.client.ZKClientConfig;

public class Test001 {

    public static void main(String[] args) throws IOException {
        String connectString = "127.0.0.1:2181";
        int sessionTimeout = 2000;
        Watcher watcher = null;
        Long sessionId = null;
        byte[] sessionPasswd = null;
        boolean canBeReadOnly = false;
        HostProvider hostProvider = null;
        ZKClientConfig clientConfig = null;
        ZooKeeper zok = new ZooKeeper(connectString, sessionTimeout, watcher, sessionId, sessionPasswd, canBeReadOnly, hostProvider, clientConfig);
    }

}
