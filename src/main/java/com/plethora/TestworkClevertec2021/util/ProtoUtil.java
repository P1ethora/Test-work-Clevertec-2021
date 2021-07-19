package com.plethora.TestworkClevertec2021.util;

import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;


public class ProtoUtil {
    public static <T extends Message> String toJson(T obj){
        try{
            return JsonFormat.printer().print(obj);
        }catch(Exception e){
            throw new RuntimeException("Error converting Proto to json", e);
        }
    }

    public static <T extends MessageOrBuilder> T toProto(String protoJsonStr, T message){
        try{
            Message.Builder builder = message.getDefaultInstanceForType().toBuilder();
            JsonFormat.parser().ignoringUnknownFields().merge(protoJsonStr,builder);
            return (T) builder.build();
        }catch(Exception e){
            throw new RuntimeException(("Error converting Json to proto"), e);
        }
    }
}
