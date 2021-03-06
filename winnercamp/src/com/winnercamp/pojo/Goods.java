package com.winnercamp.pojo;

/**
 * @author : 鱼摆摆
 * @date : Create at 2019/2/20
 * @time : 22:12
 */
public class Goods {

    /**
     * 商品的id
     */
    private Integer goods_id;
    /**
     * 商品名称
     */
    private String goods_name;
    /**
     * 商品的描述
     */
    private String goods_desc;
    /**
     * 商品的价格
     */
    private Double goods_price;
    /**
     * 书籍的作者
     */
    private String goods_author;
    /**
     * 出版社
     */
    private String goods_publish;
    /**
     * 出版时间
     */
    private Integer goods_publish_time;
    /**
     * 书籍的字数
     */
    private Double goods_words;
    /**
     * 书籍的分类id
     */
    private Integer goods_category_id;
    /**
     * 书籍的库存
     */
    private Integer goods_count;
    /**
     * 商品缩略图
     */
    private String goods_img;
    /**
     * 书籍是否推荐:1推荐,0不推荐
     */
    private Integer goods_recommend;

    public Goods() {
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_desc() {
        return goods_desc;
    }

    public void setGoods_desc(String goods_desc) {
        this.goods_desc = goods_desc;
    }

    public Double getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(Double goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_author() {
        return goods_author;
    }

    public void setGoods_author(String goods_author) {
        this.goods_author = goods_author;
    }

    public String getGoods_publish() {
        return goods_publish;
    }

    public void setGoods_publish(String goods_publish) {
        this.goods_publish = goods_publish;
    }

    public Integer getGoods_publish_time() {
        return goods_publish_time;
    }

    public void setGoods_publish_time(Integer goods_publish_time) {
        this.goods_publish_time = goods_publish_time;
    }

    public Double getGoods_words() {
        return goods_words;
    }

    public void setGoods_words(Double goods_words) {
        this.goods_words = goods_words;
    }

    public Integer getGoods_category_id() {
        return goods_category_id;
    }

    public void setGoods_category_id(Integer goods_category_id) {
        this.goods_category_id = goods_category_id;
    }

    public Integer getGoods_count() {
        return goods_count;
    }

    public void setGoods_count(Integer goods_count) {
        this.goods_count = goods_count;
    }

    public String getGoods_img() {
        return goods_img;
    }

    public void setGoods_img(String goods_img) {
        this.goods_img = goods_img;
    }

    public Integer getGoods_recommend() {
        return goods_recommend;
    }

    public void setGoods_recommend(Integer goods_recommend) {
        this.goods_recommend = goods_recommend;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goods_id=" + goods_id +
                ", goods_name='" + goods_name + '\'' +
                ", goods_desc='" + goods_desc + '\'' +
                ", goods_price=" + goods_price +
                ", goods_author='" + goods_author + '\'' +
                ", goods_publish='" + goods_publish + '\'' +
                ", goods_publish_time=" + goods_publish_time +
                ", goods_words=" + goods_words +
                ", goods_category_id=" + goods_category_id +
                ", goods_count=" + goods_count +
                ", goods_img='" + goods_img + '\'' +
                ", goods_recommend=" + goods_recommend +
                '}';
    }

    public void setCategory(Category category) {
    }
}
