public class Damage {

    private int factor;
    private int pointDamage;

    public Damage() {
        this.factor = 1;
        this.pointDamage = 1;
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

    public void increaseDamage(String typeChar, String typePoint, int point) {
        switch (typePoint) {
            case ("str"):
                switch (typeChar) {
                    case ("DK"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 1.5)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 3.5)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 6.5)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 9.0)));
                            break;
                        }
                        if (point > 1200) {
                            setPointDamage((int) (this.factor * (point * 10.1)));
                            break;
                        }
                    case ("DW"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 1.2)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 2.5)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 3.0)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 4.5)));
                        } else {
                            setPointDamage((int) (this.factor * (point * 7.5)));
                        }
                        break;
                    case ("DL"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 1.4)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 3.2)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 5.5)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 8.1)));
                            break;
                        } else {
                            setPointDamage((int) (this.factor * (point * 9.9)));
                            break;
                        }
                    case ("EF"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 0.9)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 2.2)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 2.9)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 3.9)));
                            break;
                        } else {
                            setPointDamage((int) (this.factor * (point * 6.5)));
                            break;
                        }
                    case ("MG"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 1.5)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 3.5)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 6.5)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 9.0)));
                            break;
                        } else {
                            setPointDamage((int) (this.factor * (point * 8.1)));
                            break;
                        }
                }
            case ("ag"):
                switch (typeChar) {
                    case ("DK"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 0.9)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 1.2)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 2.5)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 3.5)));
                            break;
                        }
                        if (point > 1200) {
                            setPointDamage((int) (this.factor * (point * 4.5)));
                            break;
                        }
                    case ("DW"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 0.5)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 1.1)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 2.4)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 3.1)));
                        } else {
                            setPointDamage((int) (this.factor * (point * 4.3)));
                        }
                        break;
                    case ("DL"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 0.8)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 1.5)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 3.5)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 3.9)));
                            break;
                        } else {
                            setPointDamage((int) (this.factor * (point * 5.1)));
                            break;
                        }
                    case ("EF"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 0.5)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 1.1)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 2.1)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 2.9)));
                            break;
                        } else {
                            setPointDamage((int) (this.factor * (point * 3.8)));
                            break;
                        }
                    case ("MG"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 0.8)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 1.4)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 3.0)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 3.5)));
                            break;
                        } else {
                            setPointDamage((int) (this.factor * (point * 4.8)));
                            break;
                        }
                }
            case ("en"):
                switch (typeChar) {
                    case ("DK"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 1.8)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 3.9)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 6.9)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 9.2)));
                            break;
                        }
                        if (point > 1200) {
                            setPointDamage((int) (this.factor * (point * 10.8)));
                            break;
                        }
                    case ("DW"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 1.6)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 2.7)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 3.5)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 4.7)));
                        } else {
                            setPointDamage((int) (this.factor * (point * 7.8)));
                        }
                        break;
                    case ("DL"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 1.9)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 3.9)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 6.1)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 8.9)));
                            break;
                        } else {
                            setPointDamage((int) (this.factor * (point * 10.2)));
                            break;
                        }
                    case ("EF"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 1.1)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 2.7)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 3.2)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 4.2)));
                            break;
                        } else {
                            setPointDamage((int) (this.factor * (point * 6.9)));
                            break;
                        }
                    case ("MG"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 1.9)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 4.1)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 6.8)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 8.8)));
                            break;
                        } else {
                            setPointDamage((int) (this.factor * (point * 9.9)));
                            break;
                        }
                }
            case ("sta"):
                switch (typeChar) {
                    case ("DK"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 0.5)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 2.5)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 5.5)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 8.0)));
                            break;
                        }
                        if (point > 1200) {
                            setPointDamage((int) (this.factor * (point * 9.1)));
                            break;
                        }
                    case ("DW"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 0.5)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 1.5)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 2.1)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 3.6)));
                        } else {
                            setPointDamage((int) (this.factor * (point * 5.5)));
                        }
                        break;
                    case ("DL"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 1.1)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 2.2)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 4.5)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 6.1)));
                            break;
                        } else {
                            setPointDamage((int) (this.factor * (point * 8.9)));
                            break;
                        }
                    case ("EF"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 0.3)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 1.2)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 1.9)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 2.9)));
                            break;
                        } else {
                            setPointDamage((int) (this.factor * (point * 5.5)));
                            break;
                        }
                    case ("MG"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 1.0)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 2.5)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 5.5)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 7.0)));
                            break;
                        } else {
                            setPointDamage((int) (this.factor * (point * 7.5)));
                            break;
                        }
                }
            case ("mn"):
                switch (typeChar) {
                    case ("DK"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 0.5)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 1.5)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 2.5)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 3.0)));
                            break;
                        }
                        if (point > 1200) {
                            setPointDamage((int) (this.factor * (point * 4.1)));
                            break;
                        }
                    case ("DW"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 2.2)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 3.5)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 4.1)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 5.5)));
                        } else {
                            setPointDamage((int) (this.factor * (point * 8.9)));
                        }
                        break;
                    case ("DL"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 0.5)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 1.2)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 2.6)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 4.9)));
                            break;
                        } else {
                            setPointDamage((int) (this.factor * (point * 7.1)));
                            break;
                        }
                    case ("EF"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 1.5)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 3.2)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 4.9)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 5.9)));
                            break;
                        } else {
                            setPointDamage((int) (this.factor * (point * 7.1)));
                            break;
                        }
                    case ("MG"):
                        if (point <= 100) {
                            setPointDamage((int) (this.factor * (point * 2.5)));
                            break;
                        }
                        if (point > 100 && point <= 350) {
                            setPointDamage((int) (this.factor * (point * 3.5)));
                            break;
                        }
                        if (point > 350 && point <= 750) {
                            setPointDamage((int) (this.factor * (point * 4.7)));
                            break;
                        }
                        if (point > 750 && point <= 1200) {
                            setPointDamage((int) (this.factor * (point * 6.9)));
                            break;
                        } else {
                            setPointDamage((int) (this.factor * (point * 9.1)));
                            break;
                        }
                }
        }
    }

}
