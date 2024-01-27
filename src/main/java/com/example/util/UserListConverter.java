//package com.example.util;
//
//import com.example.entity.User;
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
//
//@JsonComponent
//public class UserListConverter {
//
//    public static class Serializer extends StdSerializer<List<User>> {
//
//        protected Serializer() {
//            super(List<User>);
//        }
//
//        @Override
//        public void serialize(List<User> value, JsonGenerator gen, SerializerProvider provider) throws IOException {
//            gen.writeStartArray();
//            for (User user : value) {
//                gen.writeObject(user);
//            }
//            gen.writeEndArray();
//        }
//    }
//
//    public static class Deserializer extends StdDeserializer<List<User>> {
//
//        protected Deserializer() {
//            super(List.class);
//        }
//
//        @Override
//        public List<User> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
//            JsonNode node = p.readValueAsTree();
//            List<User> userList = new ArrayList<>();
//            for (JsonNode userNode : node) {
//                userList.add(p.getCodec().treeToValue(userNode, User.class));
//            }
//            return userList;
//        }
//    }
//}
