package extendstest;

public class CaptionEx {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();

        // 채널, 색상, 전원여부
        cTv.setChannel(11);
        cTv.setColor("Black");
        cTv.power();

        cTv.channelUp();
        System.out.println("현재 채널 : " + cTv.getChannel());

        cTv.displayCation("안녕하세요");
        cTv.setChannel(12);
        cTv.displayCation("Hello World");
    }
}