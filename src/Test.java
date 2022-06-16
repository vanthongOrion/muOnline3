public class Test {
    private String name;
    private String type;
    private int point;

    public Test(String type){
        this.type = type;
        this.point = 0;

        switch (type) {
            case "str":
                this.name = "strength";
            case "ag":
                this.name = "agility";
            case "en":
                this.name = "energy";
            case "sta":
                this.name = "stamina";
            case "mn":
                this.name = "mana";
        }
    }

    public String getName() {
        return name;
    }


    public String getType() {
        return type;
    }


    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
