package com.example.entity;
import lombok.Data;

@Data
public class Photo {
    public Integer id;
    public Integer history_id;
    public String base64Image;

    public Photo(Integer id, Integer history_id, String base64Image){
        this.id=id;
        this.history_id=history_id;
        this.base64Image=base64Image;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "history_id=" + history_id +
                ", base64Image='" + base64Image + '\'' +
                '}';
    }

}
