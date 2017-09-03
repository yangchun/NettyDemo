package com.MessagePack;

import org.msgpack.MessagePack;
import org.msgpack.template.Templates;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangchun on 2017/6/15.
 */
public class TestMsgPack {
    public static void main(String[] args) throws Exception {
        List<String> src=new ArrayList<String>();
        src.add("msgpack");
        src.add("kumofs");
        src.add("viver");

        MessagePack msgPack=new MessagePack();
        byte[] raw=msgPack.write(src);

        List<String> dst1=msgPack.read(raw, Templates.tList(Templates.TString));
        System.out.println(dst1.get(0));
        System.out.println(dst1.get(1));
        System.out.println(dst1.get(2));


    }
}
