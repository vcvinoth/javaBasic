package com.org.vc;

public class Notes {

    private int id;
    private String name;
    private int tagId;

    public Notes(int id, String name, int tagId) {
        this.id = id;
        this.name = name;
        this.tagId = tagId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tagId=" + tagId +
                '}';
    }
}
