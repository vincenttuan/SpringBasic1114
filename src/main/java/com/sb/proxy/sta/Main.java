package com.sb.proxy.sta;

public class Main {
    public static void main(String[] args) {
        Job proxyJob = new ProxyJob(new RealJob());
        proxyJob.work();
        
        Job proxyJob2 = new ProxyJob(new ProgrammerJob());
        proxyJob2.work();
    }
    
}
