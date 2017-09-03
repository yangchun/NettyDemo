package com.http.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;

import java.io.*;

/**
 * Created by yangchun on 2017/6/18.
 */
public class HttpFileServerHandler extends SimpleChannelInboundHandler<FullHttpRequest> {

    @Override
    protected void messageReceived(ChannelHandlerContext ctx, FullHttpRequest request) throws Exception {
        if(!request.decoderResult().isSuccess()){
            System.out.println("request解码异常");
        }
        if(request.method()!= HttpMethod.GET){
            System.out.println("method异常");
        }
        final String uri=request.uri();
        final String path="";
        if(path==null){

        }
        File file=new File(path);
        if(file.isHidden()||!file.exists()){
        }
        RandomAccessFile randomAccessFile=null;
        try {
            randomAccessFile=new RandomAccessFile(file,"r");
        }catch (FileNotFoundException fnfe){

        }
        Long fileLength=randomAccessFile.length();
        HttpResponse response=new DefaultFullHttpResponse(HttpVersion.HTTP_1_1,HttpResponseStatus.OK);










    }
}
