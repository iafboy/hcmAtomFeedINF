package com.cncustompoc.SingletonSrvcs.Common;

import com.cncustompoc.SingletonSrvcs.domains.Message;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

@Component
public class CommonParams {
    public static List<Message> messageList=new ArrayList<>();
    public static List<String> contentList=new ArrayList<>();
    public static String initTime="2016-01-10T18:53:22.000Z";
    public static LinkedBlockingQueue<String> messagequeue=new LinkedBlockingQueue();
}
