//package com.example.util;
//
//
//import com.fasterxml.jackson.core.JsonGenerator;
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.DeserializationContext;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.JsonSerializer;
//import com.fasterxml.jackson.databind.SerializerProvider;
//import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
//import com.fasterxml.jackson.databind.ser.std.StdSerializer;
//import org.springframework.boot.jackson.JsonComponent;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//@JsonComponent
//public class UserInfoListConverter {
//
//    public static class Serializer extends StdSerializer<List<UserInfo>> {
//
//        protected Serializer() {
//            super(List.class);
//        }
//
//        @Override
//        public void serialize(List<UserInfo> value, JsonGenerator gen, SerializerProvider provider) throws IOException {
//            gen.writeStartArray();
//            for (UserInfo userInfo : value) {
//                gen.writeObject(userInfo);
//            }
//            gen.writeEndArray();
//        }
//    }
//
//    public static class Deserializer extends StdDeserializer<List<UserInfo>> {
//
//        protected Deserializer() {
//            super(List.class);
//        }
//
//        @Override
//        public List<UserInfo> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
//            JsonNode node = p.readValueAsTree();
//            List<UserInfo> userInfoList = new ArrayList<>();
//            for (JsonNode userNode : node) {
//                userInfoList.add(p.getCodec().treeToValue(userNode, UserInfo.class));
//            }
//            return userInfoList;
//        }
//    }
//}
