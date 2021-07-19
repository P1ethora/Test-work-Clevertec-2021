package com.plethora.TestworkClevertec2021.util;

import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;

/**
 * Конвертер прото классов в JSON формат и наоборот
 */
public class ProtoUtil {

    /**
     * Строит JSON из proto объекта
     * @param obj объект из proto
     * @param <T>
     * @return JSON
     */
    public static <T extends Message> String toJson(T obj){
        try{
            return JsonFormat.printer().print(obj);
        }catch(Exception e){
            throw new RuntimeException("Error converting Proto to json", e);
        }
    }

    /**
     * Строит прото объект из JSON
     * @param protoJsonStr JSON
     * @param message пустой proto
     * @param <T>
     * @return proto объект
     */
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