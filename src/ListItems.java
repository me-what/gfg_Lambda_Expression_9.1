class ListItems {
    private Integer key;
    private String value;

    public ListItems(Integer id, String name)
    {
        this.key = id;
        this.value = name;
    }

    public Integer getkey() {
        return key;
    }

    public String getvalue() {
        return value;
    }
}