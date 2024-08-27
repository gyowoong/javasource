package extendstest;

public class Tv2 {
    private String color;
    private int channel;
    private boolean power;

    public Tv2(String color, int channel, boolean power) {
        this.color = color;
        this.channel = channel;
        this.power = power;
    }

    void power() {
        this.power = !this.power;
    }

    void channelUp() {
        this.channel++;
    }

    void channelDown() {
        this.channel--;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {

        if (channel < 0 || channel > 100) {
            return;
        }
        this.channel = channel;
    }

    public boolean isPower() {
        // boolean 타입인 경우는 get을 붙이지 않고 is 사용
        return power;
    }

}
