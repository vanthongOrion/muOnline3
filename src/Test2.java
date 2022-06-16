public class Test2 {
    private int factor;
    private int pointDamage;

    public Test2(){
        this.factor = 1;
        this.pointDamage = 1 ;
    }

    public void setPointDamage(int pointDamage) {
        this.pointDamage += pointDamage;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

    public int getFactor() {
        return factor;
    }

    public int getPointDamage() {
        return pointDamage;
    }

    public void increaseDamage(String typeChar, String typePoint, int point){
        switch (typePoint){
            case("str"):
                switch (typeChar){
                    case("DK"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.5)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*3.5)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*6.5)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*9.0)));
                        else setPointDamage((int) (this.factor*(point*10.1)));
                    case("DW"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.2)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*2.5)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*3.0)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*4.5)));
                        else setPointDamage((int) (this.factor*(point*7.5)));
                    case("DL"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.4)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*3.2)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*5.5)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*8.1)));
                        else setPointDamage((int) (this.factor*(point*9.9)));
                    case("EF"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*0.9)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*2.2)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*2.9)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*3.9)));
                        else setPointDamage((int) (this.factor*(point*6.5)));
                    case("MG"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.5)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*3.5)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*6.5)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*9.0)));
                        else setPointDamage((int) (this.factor*(point*8.1)));
                    default:
                        System.out.println("Invalid in process#53");
                }
            case("ag"):
                switch (typeChar){
                    case("DK"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.5)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*3.5)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*6.5)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*9.0)));
                        else setPointDamage((int) (this.factor*(point*10.1)));
                    case("DW"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.2)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*2.5)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*3.0)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*4.5)));
                        else setPointDamage((int) (this.factor*(point*7.5)));
                    case("DL"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.4)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*3.2)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*5.5)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*8.1)));
                        else setPointDamage((int) (this.factor*(point*9.9)));
                    case("EF"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*0.9)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*2.2)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*2.9)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*3.9)));
                        else setPointDamage((int) (this.factor*(point*6.5)));
                    case("MG"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.5)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*3.5)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*6.5)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*9.0)));
                        else setPointDamage((int) (this.factor*(point*8.1)));
                    default:
                        System.out.println("Invalid in process#53");
                }
            case("en"):
                switch (typeChar){
                    case("DK"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.5)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*3.5)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*6.5)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*9.0)));
                        else setPointDamage((int) (this.factor*(point*10.1)));
                    case("DW"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.2)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*2.5)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*3.0)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*4.5)));
                        else setPointDamage((int) (this.factor*(point*7.5)));
                    case("DL"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.4)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*3.2)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*5.5)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*8.1)));
                        else setPointDamage((int) (this.factor*(point*9.9)));
                    case("EF"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*0.9)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*2.2)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*2.9)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*3.9)));
                        else setPointDamage((int) (this.factor*(point*6.5)));
                    case("MG"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.5)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*3.5)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*6.5)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*9.0)));
                        else setPointDamage((int) (this.factor*(point*8.1)));
                    default:
                        System.out.println("Invalid in process#53");
                }
            case("sta"):
                switch (typeChar){
                    case("DK"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.5)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*3.5)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*6.5)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*9.0)));
                        else setPointDamage((int) (this.factor*(point*10.1)));
                    case("DW"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.2)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*2.5)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*3.0)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*4.5)));
                        else setPointDamage((int) (this.factor*(point*7.5)));
                    case("DL"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.4)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*3.2)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*5.5)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*8.1)));
                        else setPointDamage((int) (this.factor*(point*9.9)));
                    case("EF"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*0.9)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*2.2)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*2.9)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*3.9)));
                        else setPointDamage((int) (this.factor*(point*6.5)));
                    case("MG"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.5)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*3.5)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*6.5)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*9.0)));
                        else setPointDamage((int) (this.factor*(point*8.1)));
                    default:
                        System.out.println("Invalid in process#53");
                }
            case("mn"):
                switch (typeChar){
                    case("DK"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.5)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*3.5)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*6.5)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*9.0)));
                        else setPointDamage((int) (this.factor*(point*10.1)));
                    case("DW"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.2)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*2.5)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*3.0)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*4.5)));
                        else setPointDamage((int) (this.factor*(point*7.5)));
                    case("DL"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.4)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*3.2)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*5.5)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*8.1)));
                        else setPointDamage((int) (this.factor*(point*9.9)));
                    case("EF"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*0.9)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*2.2)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*2.9)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*3.9)));
                        else setPointDamage((int) (this.factor*(point*6.5)));
                    case("MG"):
                        if(point<=100) setPointDamage((int) (this.factor*(point*1.5)));
                        if(point>100&&point<=350) setPointDamage((int) (this.factor*(point*3.5)));
                        if(point>350&&point<=750) setPointDamage((int) (this.factor*(point*6.5)));
                        if(point>750&&point<=1200) setPointDamage((int) (this.factor*(point*9.0)));
                        else setPointDamage((int) (this.factor*(point*8.1)));
                    default:
                        System.out.println("Invalid in process#53");
                }
        }
    }

}
