public abstract class Ship {


    private int size;
    private String type;
    private int sPositionX;
    private int sPositionY;
    private int ePositionY;
    private int ePositionX;



    public Ship(int size, String type, int sPositionX, int sPositionY, int ePositionX,
                int ePositionY) {

        this.size = size;
        this.type = type;
        this.sPositionX = sPositionX;
        this.sPositionY = sPositionY;
        this.ePositionX = ePositionX;
        this.ePositionY = ePositionY;

    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }


    public void setsPositionX(int sPositionX) {
        this.sPositionX = sPositionX;
    }

    public void setsPositionY(int sPositionY) {
        this.sPositionY = sPositionY;
    }
    public void setePositionX(int ePositionX) {
        this.ePositionX = ePositionX;
    }
    public void setePositionY(int ePositionY) {
        this.sPositionY = sPositionY;
    }

    public int getsPositionX() {
        return sPositionX;
    }

    public int getePositionY() {
        return ePositionY;
    }

    public int getePositionX() {
        return ePositionX;
    }

    public int getsPositionY() {
        return sPositionY;
    }
}
