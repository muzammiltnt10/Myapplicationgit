package com.example.muzammil.myapplicationgit;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MastersModel {

    @SerializedName("data")
    public MastersModel data;

    @SerializedName("bodyType")
    public BodyType bodyType;

    public class BodyType {
        @SerializedName("active")
        public ArrayList<Active> active;

        public class Active {

            @SerializedName("_id")
            public String _id;

            @SerializedName("gender")
            public String gender;

            @SerializedName("name")
            public String name;

            @SerializedName("description")
            public String description;

            @SerializedName("image")
            public Image image;

            public class Image {

                @SerializedName("filename")
                public String filename;

                @SerializedName("hash")
                public String hash;

                @SerializedName("updated_at")
                public String updated_at;

            }

        }

        @SerializedName("trash")
        public ArrayList<Trash> trash;

        public class Trash {
            @SerializedName("_id")
            public String _id;

        }

    }

    @SerializedName("careTip")
    public CareTip careTip;

    public class CareTip {
        @SerializedName("active")
        public ArrayList<Active> active;

        public class Active {

            @SerializedName("_id")
            public String _id;

            @SerializedName("name")
            public String name;

            @SerializedName("heading")
            public String heading;

            @SerializedName("updated_at")
            public String updated_at;

            @SerializedName("categories")
            public ArrayList<Category> categories;

            public class Category {
                @SerializedName("id")
                public String id;
            }

            @SerializedName("selected_image")
            public String selected_image;

            @SerializedName("unselected_image")
            public String unselected_image;

        }

        @SerializedName("trash")
        public ArrayList<Trash> trash;

        public class Trash {
            @SerializedName("_id")
            public String _id;
        }

    }


    @SerializedName("category")
    public Category category;

    public class Category {
        @SerializedName("active")
        public ArrayList<Active> active;

        public class Active {
            @SerializedName("_id")
            public String _id;

            @SerializedName("name")
            public String name;

            @SerializedName("gender")
            public String gender;

            @SerializedName("parent_id")
            public String parent_id;

            @SerializedName("selected_image")
            public String selected_image;

            @SerializedName("unselected_image")
            public String unselected_image;

            @SerializedName("rank")
            public String rank;

            @SerializedName("depth")
            public String depth;

        }

        @SerializedName("trash")
        public ArrayList<Trash> trash;

        public class Trash {
            @SerializedName("_id")
            public String _id;
        }
    }


    @SerializedName("collection")
    public Collection collection;

    public class Collection {
        @SerializedName("active")
        public ArrayList<Active> active;

        public class Active {

            @SerializedName("_id")
            public String _id;


            @SerializedName("name")
            public String name;


            @SerializedName("image")
            public Image image;

            public class Image {
                @SerializedName("filename")
                public String filename;
            }
            @SerializedName("type")
            public String type;

            @SerializedName("updated_at")
            public String updated_at;


        }

        @SerializedName("trash")
        public ArrayList<Trash> trash;

        public class Trash {

            @SerializedName("_id")
            public String _id;
        }
    }

    @SerializedName("color")
    public Color color;

    public class Color {
        @SerializedName("active")
        public ArrayList<Active> active;

        public class Active {

            @SerializedName("_id")
            public String _id;

            @SerializedName("name")
            public String name;

            @SerializedName("hexcode")
            public String hexcode;

            @SerializedName("rgb_r")
            public String rgb_r;

            @SerializedName("rgb_g")
            public String rgb_g;

            @SerializedName("rgb_b")
            public String rgb_b;

            @SerializedName("updated_at")
            public String updated_at;


        }

        @SerializedName("trash")
        public ArrayList<Trash> trash;

        public class Trash {
            @SerializedName("_id")
            public String _id;
        }

    }

    @SerializedName("material")
    public Material material;

    public class Material {
        @SerializedName("active")
        public ArrayList<Active> active;

        public class Active {
            @SerializedName("_id")
            public String _id;
            @SerializedName("name")
            public String name;

        }

        @SerializedName("trash")
        public ArrayList<Trash> trash;

        public class Trash {
            @SerializedName("_id")
            public String _id;
        }

    }

    @SerializedName("occasion")
    public Occasion occasion;

    public class Occasion {
        @SerializedName("active")
        public ArrayList<Active> active;

        public class Active {

            @SerializedName("_id")
            public String _id;

            @SerializedName("name")
            public String name;

            @SerializedName("updated_at")
            public String updated_at;


        }

        @SerializedName("trash")
        public ArrayList<Trash> trash;

        public class Trash {
            @SerializedName("_id")
            public String _id;

        }

    }

    @SerializedName("pattern")
    public Pattern pattern;

    public class Pattern {
        @SerializedName("active")
        public ArrayList<Active> active;

        public class Active {

            @SerializedName("_id")
            public String _id;

            @SerializedName("name")
            public String name;
            @SerializedName("updated_at")
            public String updated_at;


        }

        @SerializedName("trash")
        public ArrayList<Trash> trash;

        public class Trash {
            @SerializedName("_id")
            public String _id;
        }

    }

    @SerializedName("size")
    public Size size;

    public class Size {
        @SerializedName("active")
        public ArrayList<Active> active;

        public class Active {
            @SerializedName("_id")
            public String _id;

            @SerializedName("display_value")
            public String display_value;


            @SerializedName("categories")
            public ArrayList<Category> categories;

            public class Category {
                @SerializedName("id")
                public String id;

            }
        }

        @SerializedName("trash")
        public ArrayList<Trash> trash;

        public class Trash {
            @SerializedName("_id")
            public String _id;
        }

    }

    @SerializedName("skinTone")
    public SkinTone skinTone;

    public class SkinTone {
        @SerializedName("active")
        public ArrayList<Active> active;

        public class Active {
            @SerializedName("_id")
            public String _id;

            @SerializedName("name")
            public String name;

            @SerializedName("description")
            public String description;

            @SerializedName("image")
            public Image image;

            public class Image {
                @SerializedName("filename")
                public String filename;

            }

            @SerializedName("updated_at")
            public String updated_at;


        }

        @SerializedName("trash")
        public ArrayList<Trash> trash;

        public class Trash {

            @SerializedName("_id")
            public String _id;

        }

    }

    @SerializedName("style")
    public Style style;

    public class Style {
        @SerializedName("active")
        public ArrayList<Active> active;

        public class Active {
            @SerializedName("_id")
            public String _id;

            @SerializedName("name")
            public String name;

            @SerializedName("updated_at")
            public String updated_at;

            @SerializedName("categories")
            public ArrayList<Category> categories;

            public class Category {
                @SerializedName("id")
                public String id;
            }
        }

        @SerializedName("trash")
        public ArrayList<Trash> trash;

        public class Trash {
            @SerializedName("id")
            public String id;
        }
    }

    @SerializedName("status")
    public Status status;

    public class Status {
        @SerializedName("active")
        public ArrayList<Active> active;

        public class Active {
            @SerializedName("_id")
            public String _id;

            @SerializedName("key")
            public String key;

            @SerializedName("order")
            public String order;

            @SerializedName("title")
            public String title;

            @SerializedName("categories")
            public ArrayList<Category> categories;

            public class Category {
                @SerializedName("id")
                public String id;

            }
        }

        @SerializedName("trash")
        public ArrayList<Trash> trash;

        public class Trash {
            @SerializedName("id")
            public String id;

        }
    }

    @SerializedName("app")
    public App app;

    public class App {
        @SerializedName("active")
        public ArrayList<Status.Active> active;

        public class Active {
            @SerializedName("_id")
            public String _id;

            @SerializedName("key")
            public String key;

            @SerializedName("order")
            public String order;

            @SerializedName("title")
            public String title;

            @SerializedName("categories")
            public ArrayList<Category> categories;

            public class Category {
                @SerializedName("id")
                public String id;
            }
        }
    }
}
